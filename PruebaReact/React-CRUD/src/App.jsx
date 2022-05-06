import { useState } from 'react'
import './App.css'
import Form from './components/Form'
import ListOfToDo from './components/ListOfToDo'
import StoreProvider from './components/StoreProvider'
import 'bootstrap/dist/css/bootstrap.min.css';
import MainForm from './components/MainForm'
import ListOfOperation from './components/ListOfOperation'
function App() {
   
  return (
    <StoreProvider>
        <h1>Dashboard</h1>
        <MainForm/>
        <ListOfOperation/>
    </StoreProvider>
  )
}

export default App
