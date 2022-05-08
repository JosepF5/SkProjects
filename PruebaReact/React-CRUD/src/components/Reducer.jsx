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
            id: Math.floor(Math.random() * 10000),
            title: action.payload.title,
            message: action.payload.message,
            idOperation: action.payload.idOperation.idOperation,
            done: false
        }
        //console.log("Note")
        //console.log(newNote);
        //console.log("Querys")
        //console.log(action.payload.idOperation.idOperation);
        //
        //const newListOfOperations=state.listOfOperation.filter(note=>note.id===action.payload.idOperation.idOperation)
        //console.log("Operation")
        //console.log(newListOfOperations)
        //
        //const iterator=state.listOfOperation.findIndex(i => i.id === action.payload.idOperation.idOperation);
        //console.log(iterator)
        
        const newListOfNotesAddedOne=[...state.listOfNotes,newNote]
        const newStateAddNote={
            ...state, listOfNotes:newListOfNotesAddedOne
        }
        /*
        console.log("nuevo")
        
        const newOption=[...state.listOfOperation[iterator].tasks,newNote]
        console.log(state.listOfOperation[iterator])
        console.log(newOption)
        //console.log(newOption)
        console.log("nuevoaaaa")
        const newListOfNotesAddedOne=[...state.listOfOperation,newOption]
        console.log(newListOfNotesAddedOne)
        const newStateAddNote={
            ...state, listOfOperation:newListOfNotesAddedOne
        }*/
        console.log(newStateAddNote)
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
            id: Math.floor(Math.random() * 10000),
            operation: action.payload.operation,
            tasks:[
                {
                    id: Math.floor(Math.random() * 10000),
                    title: "aaaaa",
                    message: "camila ola diablo",
                    done: false
                }
            ]
        }
        const newListOfOpAddedOne=[...state.listOfOperation,newOperation]
        const newStateAddOp={
            ...state, listOfOperation:newListOfOpAddedOne
        }
        return newStateAddOp
  }
}

export default Reducer

//state.listOfOperation.tasks