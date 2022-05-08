import React, { useContext, useEffect } from 'react'
import {Store} from './StoreProvider'

function ListOfToDo({notes}) {

  const {state, dispatch} = useContext(Store)

  const onCheckbox= async (e,note)=>{
    const checked=e.currentTarget.checked;

    let noteWithCheckboxInformation={...note,
    done:checked}
    let noteUpdatePromise=  await fetch(`http://localhost:8081/api/update/note`,
    {
        method: 'PUT',
        headers: {
            'Content-Type': 'application/json'
            },
        body: JSON.stringify(noteWithCheckboxInformation)
    }) 
    let noteUpdated=await noteUpdatePromise.json()
    dispatch({
        type: 'update-note',
        payload: noteUpdated
    })
  }

  const onDelete= async (note)=>{
    let response= await fetch(`http://localhost:8081/api/delete/note/${note.id}`,
    {
        method: 'DELETE'
    }) 
    if (response.status===200) {
      dispatch({
        type: 'remove-note',
        payload: note
    })
    }
  }
  
  const onEdit= async (note)=>{
    const iterator=state.listOfOperation.findIndex(i => i.id === note.fkOperationId);
    console.log(iterator)
    console.log(note.title)
    console.log(note.message)
    document.getElementById('InputTitle').value=note.title
    document.getElementById('InputMessage').value=note.message
    onDelete(note)
  }
  return (
    <div>
      <ul>
      {notes.map(function(note) {
        return <li style={note.done? {textDecoration:'line-through'}:{}} key={note.id}>
          {note.title} <br/>
          {note.message} <br/>
          <input onChange={(e)=>onCheckbox(e,note)} type="checkbox" checked={note.done}/>
          <button onClick={()=>onEdit(note)} type="button" className="btn btn-primary m-3">Edit</button>
          <button onClick={()=>onDelete(note)} type="button" className="btn btn-primary m-3">Delete</button>
        </li>
      })}
      </ul>
    </div>
  )
}

export default ListOfToDo