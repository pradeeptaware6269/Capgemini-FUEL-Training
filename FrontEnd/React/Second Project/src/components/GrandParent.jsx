import React from 'react'

const GrandParent = () => {

    let [state1,setState1]=useState("sumit");
        console.log(state1);
    return (
    <div>
        
        <h1>I am Grandparent Component ...</h1>
            <p>data :{state1}</p>
            <Parent data={state1}/>
    </div>
    )
}

export default GrandParent;
