import React from 'react'
import { NavLink } from "react-router-dom";
import Style from '../css/Navbar.module.css'

const Navbar = () => {
  return (
    <nav className={Style.navbar}>
        <NavLink className={Style.navlink} to="/">Home</NavLink>
        <NavLink className={Style.navlink} to="/category">Category</NavLink>
        <NavLink className={Style.navlink} to="/support">Support</NavLink>
        <NavLink className={Style.navlink} to="/login">Login</NavLink>
    </nav>
  )
}

export default Navbar
