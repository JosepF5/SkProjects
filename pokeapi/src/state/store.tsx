import {configureStore} from "@reduxjs/toolkit"
import pokemonReducer from "./features/pokemonSlice"
import dataReducer from "./features/dataSlice"
export const store = configureStore({
    reducer:{
        pokemons: pokemonReducer,
        datas:dataReducer
    }
})

export type AppDispatch = typeof store.dispatch;
export type stateType = ReturnType<typeof store.getState>;
export default store
