import './App.css'
import Nav from "react-bootstrap/Nav";
import Navbar from "react-bootstrap/Navbar";
import PokemonCard from "../src/state/features/components/PokemonCard"
import Login from "../src/state/features/components/Login"
import Data from "../src/state/features/components/Data"
import { BrowserRouter, Link, Route, Routes } from "react-router-dom";
function App() {
  
  return (
    <BrowserRouter>
      <Link to="menu"><Nav.Link href="menu">Pokemons</Nav.Link></Link>
      <Link to="home"><Nav.Link href="home">Volver</Nav.Link></Link>
      <Routes>
        <Route path="menu" element={<PokemonCard />}/>
        <Route path="home" element={<Login/>}/>
        <Route path="menu/info" element={<Data/>}/>
      </Routes>
    </BrowserRouter>
    
  )
}

export default App
