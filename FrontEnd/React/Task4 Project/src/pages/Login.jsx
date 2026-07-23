import React, { useState } from 'react'
import Style from '../css/Login.module.css'
import Userlogin from '../componants/Userlogin'
import UserRegister from '../componants/UserRegister'

const Login = () => {
  let [comp,setComp]=useState(true)
  return (
    <section className={Style.loginSection}>
      <div className={Style.loginContainer}>
        <button onClick={()=> setComp(true)}> Login</button>
        <button onClick={()=> setComp(false)}> Register</button>
      </div>
      {
        comp?<Userlogin/> : <UserRegister/>
      }

    </section>
  )
}

export default Login
