import React, { useEffect, useState } from "react";

const Clock = (props) => {
  const [time, setTime] = useState(new Date());

  let value = {
   fecha: time,
   edad: 0,
   nombre: "‘Martín’",
   apellidos: "‘San José’",
 };

  const [valor,setValor]=useState(value);
  

  useEffect(() => {
    console.log("Componente creado");

    const intervalID = setInterval(() => {
      setValor((prevState) => {
        return {
          ...prevState,
          fecha: new Date(),
        };
      });
    }, 1000);

    return () => {
      console.log("Componente va a desaparecer");
      document.title = "Tiempo detenido";
      clearInterval(intervalID);
    };
  }, []);

  return (
    <div>
      <h2>
        Hora Actual:
        {valor.fecha.toLocaleTimeString()}
      </h2>
      
    </div>
  );
};
export default Clock;
