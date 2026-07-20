// setTimeout(()=>{  
//     console.log("I Am Asyncronous ..... ")
// },3000)

// console.log("I Am sycronous.....")

  //  JSON get Data using the fake Store API

// async function dummyData(){
//     let getdata=fetch('https://fakestoreapi.com/products')
//     console.log(getdata)
//     let res=await getdata;
//     let data=await res.json()
//     console.log(data)
// }


// dummyData()




// async function dummydata1() {
//     let getdata=fetch('https://dummyjson.com/products');
//     console.log(getdata)
//     let res=await getdata;
//     let data=await res.json();
//     console.log(data);
// }
// dummydata1();

// async function dummydata1() {
//     let getdata=fetch('https://dummyjson.com/carts');
//     console.log(getdata)
//     let res=await getdata;
//     let data=await res.json();
//     console.log(data);
// }
// dummydata1();


async function userdata()
{
    let getdata=fetch('./data.json')
    console.log(getdata) // peding
    
    let res=await getdata;
    console.log(getdata) // fullfilled
    
    let data=await res.json();
    console.log(data);
    console.log(getdata) // fullfilled
}
userdata();