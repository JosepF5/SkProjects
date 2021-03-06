import { useState, useEffect } from "react";
import { useSelector, useDispatch } from "react-redux";
import { useNavigate } from "react-router-dom";
import { stateType } from "../state/store";
import Card from "react-bootstrap/Card";
const Data = () => {
  const navigate = useNavigate();
  const [data, setData] = useState(JSON.parse(localStorage.getItem("name") || "[]"));
  const { user } = useSelector((state: stateType) => state.logged);
  //console.log(data);
  useEffect(() => {
    user === null ? navigate("/login") : navigate("/menu/info");
  }, []);
  return (
    <Card>
      <Card.Body className="carta">
        <Card.Title>
          <b>{data.name}</b>
        </Card.Title>
        <Card.Text>
          <img src={data.sprites.front_default} />
          {data.abilities.map((abilitie: any) => {
            return <p className="habilidades">{abilitie.ability.name}</p>;
          })}
        </Card.Text>
      </Card.Body>
    </Card>
  );
};

export default Data;
