import React, { useState } from "react";
import axios from "axios";
import Style from "../css/Login.module.css";

function UserLogin() {

  const [loginData, setLoginData] = useState({
    email: "",
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


  // Handle login
  async function handleSubmit(e) {

    e.preventDefault();

    console.log("Login Data:", loginData);

    try {

      const response = await axios.post(
        "http://localhost:8080/users/login",
        loginData
      );

      console.log("Login Response:", response.data);

      alert(
        response.data.message ||
        "Login Successfully Completed"
      );


      // Clear form
      setLoginData({
        email: "",
        password: "",
      });


    } catch (error) {

      console.error("Login Error:", error);

      if (error.response) {

        console.log(
          "Status:",
          error.response.status
        );

        console.log(
          "Backend Response:",
          error.response.data
        );

        alert(
          error.response.data.message ||
          "Login Failed"
        );

      } else if (error.request) {

        console.error(
          "No response received from backend:",
          error.request
        );

        alert(
          "Unable to connect with Spring Boot Backend OR User Already Exits Sorry"
        );

      } else {

        alert(
          "Error: " + error.message
        );

      }

    }

  }


  return (

    <main className={Style.loginSection}>

      <form
        onSubmit={handleSubmit}
        className={Style.loginForm}
      >

        {/* Email */}

        <div className={Style.divSection}>

          <label htmlFor="email">
            Email:
          </label>

        </div>


        <div className={Style.divSection}>

          <input
            type="email"
            name="email"
            id="email"
            placeholder="Enter Email Here"
            value={loginData.email}
            onChange={handleChange}
            required
          />

        </div>


        {/* Password */}

        <div className={Style.divSection}>

          <label htmlFor="password">
            Password:
          </label>

        </div>


        <div className={Style.divSection}>

          <input
            type="password"
            name="password"
            id="password"
            placeholder="Enter Password Here"
            value={loginData.password}
            onChange={handleChange}
            required
          />

        </div>


        {/* Login Button */}

        <div className={Style.divSection}>

          <button type="submit">
            Login
          </button>

        </div>

      </form>

    </main>

  );

}

export default UserLogin;
