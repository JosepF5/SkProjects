import { useEffect, useState } from "react";
import './App.css'
import { useSelector, useDispatch } from "react-redux";
import { stateType, AppDispatch } from "../src/state/store";
import {
  getAllPokemons,
  selectPokemonStatus,
  selectPokemon,
  selectPokemonError,
  pokemonFetchStatus
} from "../src/state/features/pokemonSlice";

function App() {
  const dispatch = useDispatch<AppDispatch>();
  const pokemonState = useSelector(selectPokemon());
  const pokemonStatus = useSelector(selectPokemonStatus());
  const pokemonError = useSelector(selectPokemonError());

  useEffect(() => {
    console.log("hola effect")
    if (pokemonStatus === pokemonFetchStatus.IDLE) {
      console.log("hola effect")
      dispatch(getAllPokemons());
    }
  },[dispatch]);
  
  console.log(pokemonState.results)
  return (
    <div className="App">
      {/*pokemonState.results.map((pokemon:any) => {
          return (
            <p>{pokemon.name}</p>
          );
        })*/}
    </div>
  )
}

export default App
