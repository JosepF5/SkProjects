import React, { useContext, useEffect } from 'react'
import {Store} from './StoreProvider'
import ListOfToDo from "./ListOfToDo";
import Form from "./Form";
function ListOfOperation() {

  const {state, dispatch} = useContext(Store)
  
  const onDelete=(operation)=>{
    dispatch({
        type: 'remove-operation',
        payload: operation
    })
  }
  console.log(state.listOfOperation)
  return (
    <div>
      <ul>
      {state.listOfOperation.map(function(operation) {
        return <li key={operation.id}>
          {operation.operation} <br/>
          <button onClick={()=>onDelete(operation)} type="button" className="btn btn-danger m-3">Delete</button>
            <Form/>
            <ListOfToDo/>
        </li>
      })}
      </ul>
    </div>
  )
}

export default ListOfOperation