import React from 'react';
import Style from '../css/Child.module.css';

const Child = (props) => {

  console.log(props.data);
  console.log("child");

  return (
    
    <section className={Style.product}>
      {
      props.data?.map((value) => 
        (
        

          <div className={Style.box}>

            <h1>{(value.title)}</h1>

            <img
              src={value.image}
              alt=""
              height="300px"
              width="250px"
            />
            <h3>( Price ) $ :{value.price}</h3>

            <div className={Style.button1}>

            <button>Buy Now</button>
            <button>Add cart</button>

            </div>
            

          </div> 
        
      ))} </section>
    
  );
};

export default React.memo(Child);