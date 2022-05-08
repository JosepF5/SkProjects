import React, { useContext, useEffect } from 'react'
import {Store} from './StoreProvider'
import ListOfToDo from "./ListOfToDo";
import Form from "./Form";
function ListOfOperation() {

  const {state, dispatch} = useContext(Store)
  
  const fetchAllNotes = async () => {
    let response = await fetch(`http://localhost:8081/api/get/operations`)
    let data = await response.json()
    return data
  }

  useEffect(() => {
      let listOfOperation = fetchAllNotes().then(
          operations => {
              let action = {
                  type: 'get-operations',
                  payload: operations
              }
              dispatch(action)
          }
      )
        
  }, [])
  
  const onDelete = async (operation) => {
      let response = await fetch(`http://localhost:8081/api/delete/operation/${operation.id}`,
          {
              method: 'DELETE'
          })
      if (response.status === 200) {
          dispatch({
              type: 'remove-operation',
              payload: operation
          })
      }
  }

  return (
    <div>
      <ul>
      {state.listOfOperation.map(function(operation) {
        return (<li key={operation.id}>
        {operation.title} 
        <button onClick={()=>onDelete(operation)} type="button" className="btn btn-danger m-3">Delete</button>
        <Form idOperation={operation.id}/>
        <ListOfToDo notes={operation.notes}/>
        </li>)
      })}
      </ul>
    </div>
  )
}

export default ListOfOperation