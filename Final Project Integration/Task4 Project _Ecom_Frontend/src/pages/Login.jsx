import React, { useState } from 'react'
import Style from '../css/Login.module.css'
import Userlogin from '../componants/UserLogin'
import UserRegister from '../componants/UserRegister'

const Login = () => {
  let [comp,setComp]=useState(true)
  return (
    <section className={Style.loginSection}>
      <div className={Style.loginContainer}>
        <button onClick={()=> setComp(true)}> Login</button>
        <button onClick={()=> setComp(false)}> Register</button>
      </div>

      
      <main className={Style.loginInfomation}>
        {
        comp?<Userlogin/> : <UserRegister/>
        }
        </main>
      

    </section>
  )
}

export default Login
