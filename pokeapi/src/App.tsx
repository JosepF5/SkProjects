import './App.css'
import Nav from "react-bootstrap/Nav";
import { stateType } from "../src/state/store";
import PokemonCard from "./components/PokemonCard"
import LogIn from "./components/LogIn"
import SignIn from "./components/SignIn"
import Container from "react-bootstrap/Container";
import Data from "./components/Data"
import { useSelector } from "react-redux";
import { BrowserRouter, Link, Route, Routes } from "react-router-dom";
function App() {
  const {user} = useSelector((state:stateType) => state.logged)
  return (
    <BrowserRouter>
    {user!==null?(
      <Container>
      <Link to="menu"><Nav.Link href="menu">Pokemons</Nav.Link></Link>
      </Container>
    ):(
      <Container>
      <Link to="register"><Nav.Link href="menu">Sign In</Nav.Link></Link>
      <Link to="login"><Nav.Link href="menu">Log In</Nav.Link></Link>
      </Container>
    )}
      <Routes>
        <Route path="menu" element={<PokemonCard />}/>
        <Route path="login" element={<LogIn/>}/>
        <Route path="register" element={<SignIn/>}/>
        <Route path="menu/info" element={<Data/>}/>
      </Routes>
    </BrowserRouter>
    
  )
}

export default App
