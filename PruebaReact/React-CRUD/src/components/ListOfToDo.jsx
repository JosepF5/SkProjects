import React, { useContext } from 'react'
import {Store} from './StoreProvider'

function ListOfToDo() {

  const {state, dispatch} = useContext(Store)
  
  const onCheckbox=(e,note)=>{
    const checked=e.currentTarget.checked;
    dispatch({
        type: 'update-note',
        payload: {
            ...note,
            done:checked
        }
    })
  }

  const onDelete=(note)=>{
    dispatch({
        type: 'remove-note',
        payload: note
    })
  }

  return (
    <div>
      <h1>Actions pending to be done</h1>
      <ul>
      {state.listOfNotes.map(function(note) {
        return <li style={note.done? {textDecoration:'line-through'}:{}}key={note.id}>
          {note.title} <br/>
          {note.message} <br/>
          <input onChange={(e)=>onCheckbox(e,note)} type="checkbox" checked={note.done}/>
          <button onClick={()=>onDelete(note)}>Delete</button>
        </li>
      })}
      </ul>
      
    </div>
  )
}

export default ListOfToDo