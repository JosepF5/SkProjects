import {configureStore} from "@reduxjs/toolkit"
import pokemonReducer from "./features/pokemonSlice"
import dataReducer from "./features/dataSlice"
import loggedInReducer from "./features/loggedInSlice"
export const store = configureStore({
    reducer:{
        pokemons: pokemonReducer,
        datas:dataReducer,
        logged:loggedInReducer
    }
})

export type AppDispatch = typeof store.dispatch;
export type stateType = ReturnType<typeof store.getState>;
export default store
