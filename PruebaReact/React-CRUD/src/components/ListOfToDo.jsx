import React, { useContext, useEffect } from 'react'
import {Store} from './StoreProvider'

function ListOfToDo(operation) {

  const {state, dispatch} = useContext(Store)
  /*
  useEffect(()=>{
    let listOfNote= fetchAllNotes().then(
      notes=>{
        let action={
          type: 'get-notes',
          payload: notes
        }
        dispatch(action)
      }
    )
  },[])

  const fetchAllNotes = async () => {
    let response = await fetch(`http://localhost:8081/api/get/notes`)
    let data = await response.json()
    return data
  }

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
  }*/

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

  const onEdit= async (note)=>{
    const iterator=state.listOfOperation.findIndex(i => i.id === note.idOperation);
    document.getElementsByClassName('inputTitle')[iterator].value=note.title
    document.getElementsByClassName('inputMessage')[iterator].value=note.message
    onDelete(note)
  }
  const newState= state.listOfNotes.filter(note=>note.idOperation===operation.idOperation.id)
  return (
    <div>
      <ul>
      {newState.map(function(note) {
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