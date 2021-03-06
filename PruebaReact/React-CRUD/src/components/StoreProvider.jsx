import React,{createContext,useReducer} from 'react'
import Reducer from './Reducer'

const initialState ={
    listOfNotes:[],
    listOfOperation:[]
}
const Store = createContext(initialState)
const StoreProvider=({children})=>{
    const [state,dispatch]=useReducer(Reducer,initialState)
    return(
        <Store.Provider value={{state,dispatch}}>
            {children}
        </Store.Provider>
    )
}    

export default StoreProvider

export {Store, initialState}