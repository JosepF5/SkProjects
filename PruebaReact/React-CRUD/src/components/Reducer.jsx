import React from 'react'

function Reducer(state,action) {
  switch(action.type) {
    /*
    case 'get-notes':
        const stateWithAllTheNotes= {
            ...state,
            listOfNotes: action.payload
        }
        return stateWithAllTheNotes;
    case 'add-note':
        console.log(action.payload);
        const newNote=action.payload;
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
        const newListOfNotes=state.listOfNotes.map(note=>{
            if(note.id== action.payload.id){
                return action.payload
            }
            return note
        })
        const newStateModifiedCheckbox={...state,listOfNotes:newListOfNotes}
        return newStateModifiedCheckbox
    */
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
    case 'get-operation':
        return state;
    case 'remove-operation':
        const newListOfOperationsWithoutPayloadOperation=state.listOfOperation.filter(operation=>operation.id!==action.payload.id)
        const newStateWithOperationDeleted={...state,listOfOperation:newListOfOperationsWithoutPayloadOperation}
        return newStateWithOperationDeleted
    case 'add-operation':
        const newOperation={
            id: Math.floor(Math.random() * 100),
            operation: action.payload.operation
        }
        const newListOfOpAddedOne=[...state.listOfOperation,newOperation]
        const newStateAddOp={
            ...state, listOfOperation:newListOfOpAddedOne
        }
        return newStateAddOp
  }
}

export default Reducer