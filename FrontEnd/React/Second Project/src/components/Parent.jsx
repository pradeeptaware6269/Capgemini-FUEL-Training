import React, { useState } from 'react'

const Parent = () => {

    let [state,setState]=useState("chanchal");
    console.log(state);
  return (
    <div>
        <h1>I ma parent Component ...</h1>
        <p>data :{state}</p>
        <child data={state}/>
      
    </div>
  )
}

export default Parent
