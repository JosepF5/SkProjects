import React, { useContext, useState, useRef } from 'react'
import { Store } from './StoreProvider'

function Form({idOperation}) {

    const formRef = useRef(null)

    
    const onAdd = async (e) => {
        e.preventDefault();
        if(title && message){
            const noteFromForm= {
                title,
                message,
                done:false,
                fkOperationId: idOperation
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
            setTitle('')
            setMessage('')
        }
    }
    const {state, dispatch } = useContext(Store)

    const [title, setTitle] = useState('');

    const [message, setMessage] = useState('');

    const addingTitle = (e) => {
        setTitle(e.target.value)
    }

    const addingMessage = (e) => {
        setMessage(e.target.value)
    }

    return (
        <form ref={formRef} >
            <div className="form-group m-3">
                <label htmlFor="InputTitle">Title</label>
                <input onChange={addingTitle} type="text" className="form-control inputTitle" id="InputTitle" placeholder="Titulo">
                </input>
            </div>
            <div className="form-group m-3">
                <label htmlFor="InputMessage">Message</label>
                <input onChange={addingMessage} type="text" className="form-control inputMessage" id="InputMessage" placeholder="Mensaje">
                </input>
            </div>
            <button onClick={onAdd} className="btn btn-success m-3">Add Note</button>
        </form>
    )
}

export default Form
