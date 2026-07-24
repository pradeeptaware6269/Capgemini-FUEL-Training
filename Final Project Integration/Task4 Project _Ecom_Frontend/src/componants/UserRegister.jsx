import React, { useState } from "react";
import axios from "axios";
import Style from "../css/Login.module.css";


const UserRegister = () => {

  const [registerData, setRegisterData] = useState({
    firstName: "",
    lastName: "",
    email: "",
    phone:"",
    password: "",
    confirmPassword: "",
  });


  // Handle Input Change
  function registerHandleChange(e) {

    const { name, value } = e.target;

    setRegisterData((prevData) => ({
      ...prevData,
      [name]: value,
    }));
  }


  // Handle Registration
  async function registerHandleSubmit(e) {

    e.preventDefault();

    // Password validation
    if (registerData.password !== registerData.confirmPassword) {

      alert("Password and Confirm Password do not match");

      return;
    }


    // Password length validation
    if (registerData.password.length < 8) {

      alert("Password must contain at least 8 characters");

      return;
    }
 

    {/* Old Code  */}

    // // Data that will be sent to Spring Boot
    // const requestData = {
    //   firstName: registerData.firstName,
    //   lastName: registerData.lastName,
    //   email: registerData.email,
    //   password: registerData.password,
    // };


    {/* New code */}
                                            const requestData = {
                                              firstName: registerData.firstName,
                                              lastName: registerData.lastName,
                                              email: registerData.email,
                                              phone: registerData.phone,
                                              password: registerData.password,
                                            };


    console.log("Request Data:", requestData);


    try {

      const response = await axios.post(
  "http://localhost:8080/users/register",
  requestData
);


      console.log("Backend Response:", response.data);


      alert(
        response.data.message ||
        "Registration Successfully Completed"
      );


      // Clear form
      handleClear();


    } catch (error) {

      console.error("Registration Error:", error);


      if (!(error.response)) {

        alert(
          error.response.data.message ||
          "Registration Failed"
        );

      } else {

        alert(
          "Unable to connect with Spring Boot Backend"
        );

      }

    }

  }


  // Clear Form
  function handleClear() {

    setRegisterData({
      firstName: "",
      lastName: "",
      email: "",
      password: "",
      confirmPassword: "",
    });

  }


  return (

    <div>

      <h3>Registration Form</h3>
      <br /><br />


      <form
        onSubmit={registerHandleSubmit}
        className={Style.registerContainer}
      >


        {/* First Name */}

        <label htmlFor="firstName">
          First Name 
        </label>

        <input
          type="text"
          name="firstName"
          id="firstName"
          placeholder="Enter First Name"
          value={registerData.firstName}
          onChange={registerHandleChange}
          required
        />
        


        {/* Last Name */}

        <label htmlFor="lastName">
          Last Name 
        </label>


        <input
          type="text"
          name="lastName"
          id="lastName"
          placeholder="Enter Last Name"
          value={registerData.lastName}
          onChange={registerHandleChange}
          required
        />
  


        {/* Email */}

        <label htmlFor="email">
          Email 
        </label>

        <input
          type="email"
          name="email"
          id="email"
          placeholder="Enter Email"
          value={registerData.email}
          onChange={registerHandleChange}
          required
        />

        <label htmlFor="phone">Phone </label>                                                {/* here we areadding the new afetr the somegetting the issues  */}
        <input
          type="text"
          id="phone"
          name="phone"
          placeholder="Enter Mobile Number"
          value={registerData.phone}
          onChange={registerHandleChange}
          required
        />
        

        {/* Password */}

        <label htmlFor="password">
          Password 
        </label>

        <input
          type="password"
          name="password"
          id="password"
          minLength={8}
          maxLength={40}
          placeholder="Enter Password"
          value={registerData.password}
          onChange={registerHandleChange}
          required
        />


        {/* Confirm Password */}

        <label htmlFor="confirmPassword">
          Confirm Password
        </label>

        <input
          type="password"
          name="confirmPassword"
          id="confirmPassword"
          minLength={8}
          maxLength={40}
          placeholder="Confirm Password"
          value={registerData.confirmPassword}
          onChange={registerHandleChange}
          required
        />
        


        {/* Button */}

        <button type="submit">
          Register
        </button>

        <button
          type="button"
          onClick={handleClear}
        >
          Clear
        </button>


      </form>

    </div>

  );
};


export default UserRegister;