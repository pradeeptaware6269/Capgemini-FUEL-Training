import axios from "axios";
import React from "react";

const Api = () => {
  async function getData() {
    try {
      let res = await axios.get("https://fakestoreapi.com/products");

      console.log(res.data);
    } catch (error) {
      console.log(error);
    }
  }

  let obj = {
    title: "New Product",
    price: 100,
    description: "This is a new product",
    image: "https://i.pravatar.cc",
    category: "electronics",
  };

  let jsonData=JSON.stringify(obj)
  console.log(jsonData);

  async function postData() {
    try {
      let res = await axios.post("https://fakestoreapi.com/products", jsonData);

      console.log(res.data);
    } catch (error) {
      console.log(error);
    }
  }

  async function putData() {
    try {
      let obj = {
        title: "Updated Product",
        price: 200,
        description: "This product has been updated",
        image: "https://cc",
        category: "electronics",
      };

      let res = await axios.put("https://fakestoreapi.com/products/1", jsonData);

      console.log(res.data);
    } catch (error) {
      console.log(error);
    }
  }

  async function deleteData() {
    try {
      let res = await axios.delete("https://fakestoreapi.com/products/1");

      console.log(res.data);
    } catch (error) {
      console.log(error);
    }
  }

  return (
    <>
      <button onClick={getData}>Get Data</button>

      <button onClick={postData}>Post Data</button>

      <button onClick={putData}>Put Data</button>

      <button onClick={deleteData}>Delete Data</button>
    </>
  );
};

export default Api;
