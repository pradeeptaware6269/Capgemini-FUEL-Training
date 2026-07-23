import React, { useEffect, useState } from "react";
import Child from "./Child";

const Parent = () => {
  const [count, setCount] = useState(0);
  const [apidata, setapiData] = useState([]);

  const increase = () => setCount(count + 1);
  const decrease = () => setCount(count - 1);

  console.log("Parent");

  async function fetchData() {
    let res = await fetch("https://fakestoreapi.com/products");
    let data = await res.json();
    console.log(data);
    setapiData(data);
  }

  useEffect(() => {
    fetchData();
  }, []);

  return (
    <>
        <Child data={apidata} />
      
    </>
  );
};

export default Parent;