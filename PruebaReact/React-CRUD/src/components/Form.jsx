import React, { useContext,useState,useRef} from 'react'
import {Store} from './StoreProvider'

function Form() {

    const formRef=useRef(null)

    /*
    const onAdd = async (e) => {
        e.preventDefault();
        if(title && message){
            const noteFromForm= {
                title,
                message,
                done:false
            }

            let noteSavedPromise=await fetch(`http://localhost:8081/api/save/note`,
            {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                    },
                body: JSON.stringify(noteFromForm)
            }) 
            let noteSaved=await noteSavedPromise.json()

            dispatch({
                type: 'add-note',
                payload: noteSaved
            })
            formRef.current.reset()
        }
    }*/

    const onAdd = (e) => {
        e.preventDefault()
        if(title && message){
            dispatch({
                type: 'add-note',
                payload: {
                    title,
                    message
                }
            })
            formRef.current.reset()
        }
    }
    
    const {state,dispatch} = useContext(Store)

    const [title,setTitle] = useState('');

    const [message,setMessage] = useState('');

    const addingTitle = (e) => {
        setTitle(e.target.value)
    }

    const addingMessage = (e) => {
        setMessage(e.target.value)
    }

  return (
    <form ref={formRef}>
      <label>Title:</label>
      <input onChange={addingTitle} type="text" name="title" className="inputTitle"/>
      <label>Message:</label>
      <input onChange={addingMessage} type="text" name="message" className="inputMessage"/>
      <button onClick={onAdd}>Add Note</button>
    </form>
  )
}

export default Form
