import React, { useState } from "react";
import Style from "../css/Login.module.css";

const UserRegister = () => {
  const [registerData, setRegisterData] = useState({
    firstname: "",
    lastname: "",
    phone: "",
    email: "",
    password: "",
    confirmPassword: "",
    gender: "",
    country: "",
    state: "",
    pincode: "",
    qualification: "",
    dob: "",
  });

  
  function registerHandleChange(e) {
    console.log(e.target.name);
    console.log(e.target.value);

    setRegisterData({
      ...registerData,
      [e.target.name]: e.target.value,
    });
  }

  
  function registerHandleSubmit(e) {
    e.preventDefault();

    if(registerData.password !==registerData.confirmPassword && registerData.password.length>9)
    {
      alert("Passowrd and Conferm Passowrd do not match or length short");
      return;
    }

    console.log(registerData);
    alert("Registration Successfully....")
  }

  
  function handleClear() {
    setRegisterData({
      firstname: "",
      lastname: "",
      phone: "",
      email: "",
      password: "",
      confirmPassword: "",
      gender: "",
      country: "",
      state: "",
      pincode: "",
      qualification: "",
      dob: "",
    });
  }

  return (
    <div>
      <div>
        <h3>Registration Form</h3>
      </div>


      <form onSubmit={registerHandleSubmit} className={Style.registerContainer}>
        
        <label htmlFor="firstname">First Name :</label>
        <input
          onChange={registerHandleChange}
          type="text"
          name="firstname"
          id="firstname"
          placeholder="Enter the First Name"
          value={registerData.firstname}
        />
        <br />
        <br />
        
        <label htmlFor="lastname">Last Name :</label>
        <input
          onChange={registerHandleChange}
          type="text"
          name="lastname"
          id="lastname"
          placeholder="Enter the Last Name"
          value={registerData.lastname}
        />
        <br />
        <br />
        
        <label htmlFor="phone">Phone :</label>
        <input
          onChange={registerHandleChange}
          type="tel"
          name="phone"
          id="phone"
          pattern="[0-9]{10}"
          maxLength="10"
          placeholder="Enter the Phone"
          value={registerData.phone}
        />
        <br />
        <br />
        
        <label htmlFor="email">Email :</label>
        <input
          onChange={registerHandleChange}
          type="email"
          name="email"
          id="email"
          placeholder="Enter the Email"
          value={registerData.email}
        />
        <br />
        <br />
        
        <label htmlFor="password">Password :</label>
        <input
          onChange={registerHandleChange}
          type="password"
          name="password"
          id="password"
          minLength={8}
          maxLength={40}
          placeholder="Enter the Password"
          value={registerData.password}
        />
        <br />
        <br />
        
        <label htmlFor="confirmPassword">C Password :</label>
        <input
          onChange={registerHandleChange}
          type="password"
          name="confirmPassword"
          id="confirmPassword"
          minLength={8}
          maxLength={40}
          placeholder="Confirm the Password"
          value={registerData.confirmPassword}
        />
        <br />
        <br />
        <label> Gender : </label>
        Male :
        <input
          onChange={registerHandleChange}
          type="radio"
          name="gender"
          value="Male"
          checked={registerData.gender === "Male"}
        />
        Female :
        <input
          onChange={registerHandleChange}
          type="radio"
          name="gender"
          value="Female"
          checked={registerData.gender === "Female"}
        />
        <br />
        <br />
        <label htmlFor="country">Country :</label>
        <select
          onChange={registerHandleChange}
          name="country"
          id="country"
          value={registerData.country}
        >
          <option value="">Select Country</option>
          <option value="India">India</option>
          <option value="Pakistan">Pakistan</option>
          <option value="America">America</option>
          <option value="China">China</option>
          <option value="Korea">Korea</option>
        </select>
        <br />
        <br />
        <label htmlFor="state"> State : </label>
        <select
          onChange={registerHandleChange}
          name="state"
          id="state"
          value={registerData.state}
        >
          <option value="">Select value</option>
          <option value="Maharashtra">Maharashtra</option>
          <option value="MP">MP</option>
          <option value="UP">UP</option>
          <option value="Bihar">Bihar</option>
          <option value="Punjab">Punjab</option>
        </select>
        <br />
        <br />
        <label htmlFor="pincode">Pin Code :</label>
        <input
          onChange={registerHandleChange}
          type="text"
          name="pincode"
          id="pincode"
          pattern="[0-9]{6}"
          maxLength="6"
          placeholder="Enter the Pin Code"
          value={registerData.pincode}
        />
        <br />
        <br />
        <label htmlFor="qualification">Qualification :</label>
        <select
          onChange={registerHandleChange}
          name="qualification"
          id="qualification"
          value={registerData.qualification}
        >
          <option value="">Select Qualification</option>
          <option value="BCS">BCS</option>
          <option value="BCA">BCA</option>
          <option value="MCS">MCS</option>
          <option value="MCA">MCA</option>
          <option value="BTech">B.Tech</option>
        </select>
        <br />
        <br />
        <label htmlFor="dob">DOB :</label>
        <input
          onChange={registerHandleChange}
          type="date"
          name="dob"
          id="dob"
          value={registerData.dob}
        />
        <br />
        <br />
        <button type="submit">Register</button>
        <button type="button" onClick={handleClear}>
          Clear
        </button>
      </form>
      </div>
    
  );
};

export default UserRegister;
