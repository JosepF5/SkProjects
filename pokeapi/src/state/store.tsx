import {configureStore} from "@reduxjs/toolkit"
import pokemonReducer from "./features/pokemonSlice"
export const store = configureStore({
    reducer:{
        pokemons: pokemonReducer
    }
})

export type AppDispatch = typeof store.dispatch;
export type stateType = ReturnType<typeof store.getState>;
export default store
