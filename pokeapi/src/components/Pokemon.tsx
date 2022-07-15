import Card from "react-bootstrap/Card";
import { Link } from "react-router-dom";
import "./Pokemon.css";
const Pokemon = (pokemon: any) => {
  const handleData = () => {
    localStorage.setItem("activo", "true");
    localStorage.setItem("name", JSON.stringify(pokemon.pokemon));
  };

  return (
    <>
      {
        <Card onClick={() => handleData()}>
          <Link to="info">
            <Card.Body className="carta">
              <Card.Title>
                <b>{pokemon.pokemon.name}</b>
              </Card.Title>
              <Card.Text>
                <img src={pokemon.pokemon.sprites.front_default} />
                {pokemon.pokemon.abilities.map((abilitie: any) => {
                  return (
                    <p key={abilitie.ability.name} className="habilidades">
                      {abilitie.ability.name}
                    </p>
                  );
                })}
              </Card.Text>
            </Card.Body>
          </Link>
        </Card>
      }
    </>
  );
};

export default Pokemon;
