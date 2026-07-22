import React from 'react'
import GrandParent from './GrandParent'

const Child = (props) => {
    console.log(props.data)
  return (
    <div>
        <h1>I am Child Compoent </h1>
        <p>childData :{props.data}</p>
        <GrandParent metaData={props.data}/>
      
    </div>
  )
}

export default Child
