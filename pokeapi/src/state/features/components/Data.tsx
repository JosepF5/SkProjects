import React from 'react'
import {useState,useEffect} from "react";
import {useSelector,useDispatch} from "react-redux";
import Card from "react-bootstrap/Card";
const Data = () => {

   const [data, setData] = useState(JSON.parse(localStorage.getItem('name')));

   console.log(data)
  return (
    <Card >
    <Card.Body className="carta">
      <Card.Title ><b >{data.name}</b></Card.Title>
      <Card.Text>
      <img src={data.sprites.front_default}/>
          {data.abilities.map((abilitie:any)=>{
                  return (
                      <p className="habilidades">{abilitie.ability.name}</p>
                    );
            })
          }
    </Card.Text>
    </Card.Body>
  </Card>
  )
}

export default Data
