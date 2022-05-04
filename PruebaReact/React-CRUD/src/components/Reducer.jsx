import React from 'react'

function Reducer(state,action) {
  switch(action.type) {
    case 'add-note':
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
        const newListOfNotesWithoutPayloadNote=state.listOfNotes.filter(note=>note.id!==action.payload.id)
        const newStateWithNoteDeleted={...state,listOfNotes:newListOfNotesWithoutPayloadNote}
        return newStateWithNoteDeleted
    case 'update-note':
        const newListOfNotes=state.listOfNotes.filter(note=>note.id!==action.payload.id)
        const newListOfNotesWithModification=[...newListOfNotes,action.payload]
        const newStateModifiedCheckbox={...state,listOfNotes:newListOfNotesWithModification}
        return newStateModifiedCheckbox
  }
}

export default Reducer