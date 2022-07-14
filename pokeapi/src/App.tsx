import { useEffect, useState } from "react";
import './App.css'
import { useSelector, useDispatch } from "react-redux";
import { stateType, AppDispatch } from "../src/state/store";
import {getPokemons} from "../src/state/features/pokemonSlice";
import Pokemon from "../src/state/features/components/Pokemon"
function App() {
  const dispatch = useDispatch();
  const pokemons=useSelector(
    (state:stateType)=>state.pokemons
  )
  const [loading,setLoading]=useState(true);
  const getEveryPokemon = async (id:number)=>{
    let data: any[]=[]
    for (let ide = 1; ide <= id; ide++) {
    const response = await fetch(`https://pokeapi.co/api/v2/pokemon/${ide}/`)
    data = [...data, await response.json()]
    }
    return data
  }
  useEffect(() => {
    getEveryPokemon(50).then((res)=>{
        dispatch(getPokemons(res));
        setLoading(false)
    });
    
  },[]);
  //console.log(pokemons)
  return (
    <div>
      {!loading&&pokemons.map((pokemon:any) => {
          return (
            <Pokemon key={pokemon.name} pokemon={pokemon}/>
          );
        })
      }
    </div>
  )
}

export default App
