import React from 'react'
import { useSelector, useDispatch } from "react-redux";
import { stateType, AppDispatch } from "../../../state/store";
import {getPokemons} from "../../../state/features/pokemonSlice";
import Pokemon from "../../../state/features/components/Pokemon"
import Button from 'react-bootstrap/Button';
import Form from 'react-bootstrap/Form';
import InputGroup from 'react-bootstrap/InputGroup';
import { useEffect, useState } from "react";
import Nav from "react-bootstrap/Nav";
import Navbar from "react-bootstrap/Navbar";
import { BrowserRouter, Link, Route, Routes } from "react-router-dom";
const PokemonCard = () => {
const dispatch = useDispatch();
  const pokemons=useSelector(
    (state:stateType)=>state.pokemons
  )
  const [loading,setLoading]=useState(true);
  const [value,setValue]=useState("");
  const [filtro,setFiltro]=useState([]);
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
  const handleValue=(value:any) => {
    setValue(value)
    //console.log(value)
    setFiltro(!loading&&pokemons.filter((pokemon:any) => 
        pokemon.name==value
      ))
    //console.log(filtro)
  }

  return (
    <div>
    <InputGroup className="mb-3">
        <Form.Control
          placeholder="Buscar..."
          value={value}
          onChange={(e) => handleValue(e.target.value)}
        />
        <Button variant="outline-secondary" id="button-addon2">
          Button
        </Button>
      </InputGroup>
      {!value?(!loading&&pokemons.map((pokemon:any) => {
          return (
            <Pokemon key={pokemon.name} pokemon={pokemon}/>
          );
        })):(!loading&&filtro.map((pokemon:any) => {
            return (
              <Pokemon key={pokemon.name} pokemon={pokemon}/>
            );
          }))
      }
    </div>
  )
}

export default PokemonCard
