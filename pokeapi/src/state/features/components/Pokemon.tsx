import Card from "react-bootstrap/Card";
import { useSelector, useDispatch } from "react-redux";
import { stateType, AppDispatch } from "../../store";
import { useEffect, useState } from "react";
import { BrowserRouter, Link, Route, Routes,useNavigate } from "react-router-dom";
import { getData } from "../../features/dataSlice";
import './Pokemon.css'
const Pokemon = (pokemon: any) => {
    
  const dispatchs = useDispatch();
  const dataPokemons = useSelector((state: stateType) => state.datas);
  const [loadings, setLoadings] = useState(false);
  const [nuevo, setNuevo] = useState();
  //const img=dataPokemons.sprites.front_default
  //console.log(pokemon.pokemon)
  //console.log(nuevo)
  const navigate=useNavigate();
  const handleData=()=>{
    localStorage.setItem('activo', "true");
    localStorage.setItem('name', JSON.stringify(pokemon.pokemon));
  }
  return (
    <>
    {
    (<Card onClick={()=>handleData()}>
    <Link to="info" >
    <Card.Body className="carta">
      <Card.Title ><b >{pokemon.pokemon.name}</b></Card.Title>
      <Card.Text>
      <img src={pokemon.pokemon.sprites.front_default}/>
          {pokemon.pokemon.abilities.map((abilitie:any)=>{
                  return (
                      <p className="habilidades">{abilitie.ability.name}</p>
                    );
            })
          }
    </Card.Text>
    </Card.Body>
    </Link>
  </Card>)}
  </>
  );
};

export default Pokemon;
