import axios from 'axios'
import React from 'react'

const Api = () => {

    async function getData() {
        let res = axios.get('');
        let data= await res
        console.log(data.data)
        
    }
  return (
    <div>
      A
    </div>
  )
}

export default Api
