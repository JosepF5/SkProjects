import { useState } from 'react'
import ListOfStudents from './components/ListOfStudents/ListOfStudents'
import './App.css'

function App() {
  const [number,setNumber] = useState(0)
  const addToNumber = () => {
    setNumber(number + 1)
  }
  const substractToNumber = () => {
    setNumber(number - 1)
  }
  return (
    <div>
      <h1>My first application</h1>
      <h2>{number}</h2>
      <button onClick={addToNumber}>+</button>
      <button onClick={substractToNumber}>-</button>
      <ListOfStudents/>
    </div>
  )
}

export default App
