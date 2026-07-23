import React, { useState } from 'react';
import Style from '../css/Login.module.css';

function Userlogin() {

  const [loginData, setLoginData] = useState({
    username: "",
    password: ""
  });

  function handleChange(e) {
    const { name, value } = e.target;

    setLoginData({
      ...loginData,
      [name]: value
    });
  }

  function handleSubmit(e) {
    e.preventDefault();

    console.log("Login Data:", loginData);
  }

  return (
    <main>
     
        <form onSubmit={handleSubmit}>
          

          <label htmlFor="username">
            User Name: </label>

          <input
            type="text"
            name="username"
            id="username"
            placeholder="Enter the User name Here"
            value={loginData.username}
            onChange={handleChange}
          />

          <br />
          <br />

          <label htmlFor="password">
            Password:
          </label>

          <input
            type="password"
            name="password"
            id="password"
            placeholder="Enter the Password Here"
            value={loginData.password}
            onChange={handleChange}
          />

          <br />
          <br />

          <button type="submit">
            Login
          </button>

        </form>
    </main>
  );
}

export default Userlogin;