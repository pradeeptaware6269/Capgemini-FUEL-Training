import React, { useState } from "react";
import Style from "../css/Login.module.css";

function UserLogin() {
  const [loginData, setLoginData] = useState({
    username: "",
    password: "",
  });

  // Handle input changes
  function handleChange(e) {
    const { name, value } = e.target;

    setLoginData((prevData) => ({
      ...prevData,
      [name]: value,
    }));
  }

  // Handle form submit
  function handleSubmit(e) {
    e.preventDefault();

    console.log("Login Data:", loginData);

    // Clear form after submit
    setLoginData({
      username: "",
      password: "",
    });
  }

  return (
    <main className={Style.loginSection}>
      <form onSubmit={handleSubmit} className={Style.loginForm}>
        
        <div className={Style.divSection}>
          <label htmlFor="username">User Name:</label>
        </div>

        <div className={Style.divSection}>
          <input
            type="text"
            name="username"
            id="username"
            placeholder="Enter the User Name Here"
            value={loginData.username}
            onChange={handleChange}
            required
          />
        </div>

        <div className={Style.divSection}>
          <label htmlFor="password">Password:</label>
        </div>

        <div className={Style.divSection}>
          <input
            type="password"
            name="password"
            id="password"
            placeholder="Enter the Password Here"
            value={loginData.password}
            onChange={handleChange}
            required
          />
        </div>

        <div className={Style.divSection}>
          <button type="submit">Login</button>
        </div>

      </form>
    </main>
  );
}

export default UserLogin;