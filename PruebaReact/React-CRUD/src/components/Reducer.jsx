import React from 'react'

function Reducer(state,action) {
  console.log(state)
  switch(action.type) {
    case 'add-note':
        console.log("Adding note")
        const newNote={
            id: Math.floor(Math.random() * 100),
            title: action.payload.title,
            message: action.payload.message,
            done: false
        }
        const newListOfNotesAddedOne=[...state.listOfNotes,newNote]
        const newStateAddNote={
            ...state, listOfNotes:newListOfNotesAddedOne
        }
        return newStateAddNote
    case 'remove-note':
        return state
    case 'update-note':
        return state
  }
}

export default Reducer