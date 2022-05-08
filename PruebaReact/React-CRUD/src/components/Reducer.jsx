import React from 'react'

function Reducer(state,action) {
  switch(action.type) {
    case 'remove-note':
        const newListOfNotesWithoutPayloadNote = state.listOfOperation.map(operation => {
            const newNoteDeleteOfList = operation.notes.filter(note => note.id !== action.payload.id)
            return { ...operation, notes: newNoteDeleteOfList }
        })
        return { ...state, listOfOperation: newListOfNotesWithoutPayloadNote }
    case 'add-note':
        const newListOfOperationsUpdated = state.listOfOperation.map(
            operation => {
                if (operation.id === action.payload.id) {
                    return action.payload
                }
                return operation
            })
        return { ...state, listOfOperation: newListOfOperationsUpdated }
    case 'get-operations':
        const stateWithAllOperations = {
            ...state,
            listOfOperation: action.payload
        }
        return stateWithAllOperations
    case 'update-note':
        const newListOfNotes = state.listOfOperation.map(operation => {
            const newNoteUpdated = operation.notes.map(note => {
                if (note.id === action.payload.id) {
                    return action.payload
                }
                return note
            })
            const newListModifiedCheckbox={...operation,notes:newNoteUpdated}
            return newListModifiedCheckbox
        })
        const newStateModifiedCheckbox={...state,listOfOperation:newListOfNotes}
        return newStateModifiedCheckbox
    case 'get-operation':
        return state;
    case 'remove-operation':
        const newListOfOperationsWithoutPayloadOperation=state.listOfOperation.filter(operation=>operation.id!==action.payload.id)
        const newStateWithOperationDeleted={...state,listOfOperation:newListOfOperationsWithoutPayloadOperation}
        return newStateWithOperationDeleted
    case 'add-operation':
        const newOperation = action.payload;
        const newListOfOperations = [...state.listOfOperation, newOperation]
        const newStateAddOperation={
            ...state, listOfOperation:newListOfOperations
        }
        return newStateAddOperation
  }
}

export default Reducer