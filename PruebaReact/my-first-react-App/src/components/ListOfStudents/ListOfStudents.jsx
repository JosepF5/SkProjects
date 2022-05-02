import { useState } from 'react'
import React from 'react'

function ListOfStudents() {

    const onAddStudent=(event)=>{
        event.preventDefault()
        if(name&&lastName){
            const student={
                name,
                lastName
            }
            setList([...list,student])
        }
        
    }
    const [list,setList]=useState([])
    const [name,setName]=useState('');
    const [lastName,setLastName]=useState('');

    const addName = (event) => {
        setName(event.target.value)
    }
    
    const addLastName = (event) => {
        setLastName(event.target.value)
    }
  return (
    <div>
      <h1>Hello from the list of students</h1>
      <form>
        <label>Name</label>
        <input onChange={addName} type="text" placeholder="Name"/>
        <label>Last Name</label>
        <input onChange={addLastName} type="text" placeholder="Last Name"/>
        <button onClick={onAddStudent}>Add Student</button>
        {list.map((student,index)=><div key={index}>
            <h2>{student.name}</h2>
            <h2>{student.lastName}</h2>
        </div>
        )}
      </form>
    </div>
  )
}

export default ListOfStudents
