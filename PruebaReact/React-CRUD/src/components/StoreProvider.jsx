import React,{createContext,useReducer} from 'react'
import Reducer from './Reducer'

const initialState ={
    note:{
        id:'',
        title:'',
        message:'',
        done: false
    },
    listOfNotes:[
        {
            id:'0',
            title:'Note 1',
            message:'This is the first note',
            done: true
        }
    ]
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