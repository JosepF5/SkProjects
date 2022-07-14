import { createSlice, createAsyncThunk } from "@reduxjs/toolkit";
import { stateType } from "../store";

const URL_BASE = "https://pokeapi.co/api/v2/pokemon";

export type pokemonType = {
    id?: string;
    name?: string;
    skills?:string[];
    image?: string;
    url?:string;
};

interface pokemonState extends pokemonType { }

export enum pokemonFetchStatus {
    IDLE = "idle",
    COMPLETED = "completed",
    FAILED = "failed",
    PENDING = "pending",
}

interface IPokemon {
    pokemon: any;
    status: pokemonFetchStatus;
    error: string | null;
}

const initialState: IPokemon = {
    pokemon: [],
    status: pokemonFetchStatus.IDLE,
    error: null,
};

export const getAllPokemons = createAsyncThunk('getAllPokemons', async () => {
    const response = await fetch(URL_BASE+"?limit=50")
    return (await response.json()) as pokemonType[]
})

export const pokemonSlice = createSlice({
    name: "pokemon",
    initialState,
    reducers:{},
    extraReducers:(builder)=>{
        //GET
        builder.addCase(getAllPokemons.pending, (state) => {
            state.status = pokemonFetchStatus.PENDING
        })
        builder.addCase(getAllPokemons.fulfilled, (state, action) => {
            state.status = pokemonFetchStatus.COMPLETED
            state.pokemon = action.payload
        })
        builder.addCase(getAllPokemons.rejected, (state, action) => {
            state.status = pokemonFetchStatus.FAILED
            state.error = 'Something went wrong while fetching'
            state.pokemon = []
        })
    }
})
export default pokemonSlice.reducer;
export const selectPokemonStatus = () =>
 (state: stateType) =>  state.pokemons.status;
export const selectPokemon = () =>
 (state: stateType) => state.pokemons.pokemon;
export const selectPokemonError = () =>
 (state: stateType) =>  state.pokemons.error;
