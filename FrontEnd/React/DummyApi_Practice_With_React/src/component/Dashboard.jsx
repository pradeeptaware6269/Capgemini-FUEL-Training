import React, { useEffect, useState } from 'react'
import Style from '../css/Dashboard.module.css'

const Data = (props) => {

    
    const [dataapi,setDataapi]=useState([]);

    async function fetchdata() {
        try{
        let getdata=fetch('https://dummyjson.com/recipes');
        let res=await getdata;
        const data=await res.json();
        console.log(data);
        setDataapi(data.recipes)
        }
        catch(error)
        {
            console.log(error)
        }    
    }

    console.log(props.Data)

    useEffect(() => {
        fetchdata();
    }, []);

return (
    <section className={Style.main}>
        {
    dataapi.map((value) => 
        (
            <div className={Style.div}>
                <h1>{value.name}</h1>
                <img src={value.image} alt="" height="300px" width="400px" />
                
                <h3>( Price ) $ :{value.price}</h3>
                    
                <button>Buy Now</button>
                <button>Add cart</button>
                
                            
            </div>
        ))
    }
    
    </section>
)
}

export default Data
