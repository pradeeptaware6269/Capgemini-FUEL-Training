
import { useState } from "react";


function FunctionBasedComp()
{

    let [state,setState] =useState(0);
    let [state1,setState1] =useState(0);

    // function handleChange() {
    //     setInterval(() => {
    //         setState(state => state + 1);
    //     }, 2000);
    // }

    function handleChange()
    {
        setState(state + 1);
    }

    function handleChange1()
    {
        setState1(state1 - 1);
    }

    return <>
    <h1>This is the Functinal Component </h1>
    <section class="secDiv">
    <div>
    <h1>{state}</h1>
    <button onClick={handleChange}>Increase</button>
    </div>

    <div>
    <h1>{state1}</h1>
    <button onClick={handleChange1}>Decrease</button>
    </div>
    </section>

    </>
}

export default FunctionBasedComp;