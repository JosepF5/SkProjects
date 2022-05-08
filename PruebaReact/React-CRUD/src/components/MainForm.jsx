import React, { useContext,useState,useRef} from 'react'
import ListOfToDo from './ListOfToDo'
import {Store} from './StoreProvider'

const MainForm=({children})=>{

    const formRef=useRef(null)

    
    const onAdd = (e) => {
        e.preventDefault()
        if(operation){
            dispatch({
                type: 'add-operation',
                payload: {
                    operation
                }
            })
            formRef.current.reset()
            setOperation('')
        }
    }

    const {state,dispatch} = useContext(Store)
    const [operation,setOperation] = useState('');
    const addingOperation = (e) => {
        setOperation(e.target.value)
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
