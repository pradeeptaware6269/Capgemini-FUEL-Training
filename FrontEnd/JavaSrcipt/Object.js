// console.log("Object in java Script ok!!!")

// // Object : it is an represntation of the real world entity 

// let brand ="Lenevo"

// let laptop ={
//     color :"Gray",
//     model: "G50",
//     price: 85000,
//     display :"144HZ",
//     storage: "512GB",
//     [brand]:"50% discount",
//     1:"warrenty"
// }


// console.log(laptop)


// // dot notation
// console.log("Using the Dot Notation .... ")
// console.log(laptop.price)
// console.log(laptop.storage)

// console.log("-------------------------")

// // baractket s notations  :key dynamic 
// console.log("Using brackets Notation .... ")
// console.log(laptop["color"])
// console.log(laptop[1])
// console.log(laptop[brand])

// console.log("--------------------------")
// //key ,values entries

// console.log("Using the Static methods .... ")
// console.log(Object.keys(laptop))
// console.log(Object.values(laptop))
// console.log(Object(laptop))

// console.log("--------------------------")



let data=[
    {
        ename :"Pradeep",
        age :23,
        skills:["Python","Java","Type Script"],
        address:{
            hno : 30,
            street : "Nira Road",
            city :"Pune",
            state :"Maharatra"
        }
    },

    {
        ename :"Ram",
        age :23,
        skills:["Python","Java","Type Script"],
        address:{
            hno : 30,
            street : "Phaatan Road",
            city :"Pune",
            state :"Maharatra"
        }
    },

    {
        ename :"Sumit",
        age :23,
        skills:["Python","Java","Type Script"],
        address:{
            hno : 30,
            street : "Baramati Road",
            city :"Pune",
            state :"Maharatra"
        }
    }
]

console.log(data.ename);

for(i in data)
{
    console.log(i)
}

