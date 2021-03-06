import { useState } from 'react'
import logo from './logo.svg'
import './App.css'
import {useDispatch, useSelector} from "react-redux"
import { actionCreators,State } from './state';
import { bindActionCreators } from '@reduxjs/toolkit';

function App() {
  const dispatch = useDispatch();
  const { depositMoney,withdrawMoney,bankruptMoney} = bindActionCreators(actionCreators,dispatch);
  const amount=useSelector((state:State)=>state.bank);
  return (
    <div className="App">
      <h1>{amount}</h1>
      <button onClick={()=>depositMoney(1000)}>DEPOSIT</button>
      <button onClick={()=>withdrawMoney(500)}>WITHDRAW</button>
      <button onClick={()=>bankruptMoney()}>BANKRUPT</button>
    </div>
  )
}

export default App
