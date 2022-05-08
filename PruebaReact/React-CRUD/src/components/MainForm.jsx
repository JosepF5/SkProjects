import React, { useContext,useState,useRef} from 'react'
import ListOfToDo from './ListOfToDo'
import {Store} from './StoreProvider'

const MainForm=()=>{

    const formRef=useRef(null)

    const onAdd = async (event) => {
      event.preventDefault();
      if (title) {
        console.log(title)
        const operationFromForm = {title}
        console.log(operationFromForm)
        let operationSavedPromise = await fetch(`http://localhost:8081/api/save/operation`, {
          method: 'POST',
          headers: {
            'Content-Type': 'application/json'
          },
          body: JSON.stringify(operationFromForm)
        })
        console.log(operationSavedPromise)
        let operationSaved = await operationSavedPromise.json();
        console.log(operationSaved)
        dispatch({
          type: 'add-operation',
          payload: operationSaved
        })
  
        formRef.current.reset();
        setTitle('');
      }
    }

    const {state,dispatch} = useContext(Store)
    const [title,setTitle] = useState('');
    const addingOperation = (e) => {
      setTitle(e.target.value)
    }

  return (
    <form ref={formRef}>
      <label>Operation:</label>
      <input onChange={addingOperation} type="text" name="title" id="titleMainForm"/>
      <button onClick={onAdd} className="btn btn-dark m-3">Add Operation</button>
    </form>
    
  )
}

export default MainForm
