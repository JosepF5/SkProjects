import React from 'react'
import { createSlice, PayloadAction } from "@reduxjs/toolkit";

type pokemonType = {
    id?: string;
    name?: string;
    url?: string;
}
  
const initialState: any = []

const pokemonSlice = createSlice({
    name: "pokemon",
    initialState,
    reducers: {
      getPokemons: (state, action) => {
        return action.payload;
      },
      getDataPokemons: (state, action) => {
        return action.payload;
      },
    },
})
export default pokemonSlice.reducer;
export const {getPokemons,getDataPokemons} = pokemonSlice.actions;
export type {pokemonType}
