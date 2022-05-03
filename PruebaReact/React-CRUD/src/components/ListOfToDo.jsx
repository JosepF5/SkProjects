import React, { useContext } from 'react'
import {Store} from './StoreProvider'

function ListOfToDo() {

  const {state, dispatch} = useContext(Store)
  
  return (
    <div>
      <h1>Actions pending to be done</h1>
      <ul>
      {state.listOfNotes.map(function(note) {
        return <li style={note.done? {textDecoration:'line-through'}:{}}key={note.id}>
          {note.title} <br/>
          {note.message} <br/>
        </li>
      })}
      </ul>
      
    </div>
  )
}

export default ListOfToDo