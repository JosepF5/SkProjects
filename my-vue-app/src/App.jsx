import { useState } from 'react'
import reactLogo from './assets/react.svg'
import './App.css'
import TaskList from './components/container/TaskList'
import ContactList from './components/container/ContactList'
function App() {

  return (
    <div className="App">
      <TaskList />
      <ContactList />
    </div>
  )
}

export default App
