import './App.css'
import Nav from "react-bootstrap/Nav";
import Navbar from "react-bootstrap/Navbar";
import PokemonCard from "../src/state/features/components/PokemonCard"
import LogIn from "./state/features/components/Login"
import SignIn from "./state/features/components/SignIn"
import Data from "../src/state/features/components/Data"
import { BrowserRouter, Link, Route, Routes } from "react-router-dom";
function App() {
  
  return (
    <BrowserRouter>
      <Link to="menu"><Nav.Link href="menu">Pokemons</Nav.Link></Link>
      <Link to="register"><Nav.Link href="menu">Sign In</Nav.Link></Link>
      <Link to="home"><Nav.Link href="home">Volver</Nav.Link></Link>
      <Routes>
        <Route path="menu" element={<PokemonCard />}/>
        <Route path="home" element={<LogIn/>}/>
        <Route path="register" element={<SignIn/>}/>
        <Route path="menu/info" element={<Data/>}/>
      </Routes>
    </BrowserRouter>
    
  )
}

export default App
