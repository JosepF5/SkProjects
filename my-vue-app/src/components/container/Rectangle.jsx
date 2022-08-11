import React, { useState } from "react";

const Rectangle = () => {
  const [color, setColor] = React.useState(`rgb(0, 0, 0)`);
  const [manageInterval, setManageInterval] = useState(0);

  const recStyle = {
    width: "255px",
    height: "255px",
    backgroundColor: color,
    color: "white",
  };

  const handleColor = () => {
    const red = Math.floor(Math.random() * 255),
     green = Math.floor(Math.random() * 255),
     blue = Math.floor(Math.random() * 255);
    setColor(`rgb(${red}, ${green}, ${blue})`);
  };

  const onChangeColor = () => {
    return setManageInterval(setInterval(handleColor, 500));
  };

  const onStopChangeColor = () => {
    return clearInterval(manageInterval);
  };

  return (
    <div style={recStyle} onMouseOver={onChangeColor} onMouseLeave={onStopChangeColor} onDoubleClick={onStopChangeColor}>
      Hola
    </div>
  );
};

export default Rectangle;
