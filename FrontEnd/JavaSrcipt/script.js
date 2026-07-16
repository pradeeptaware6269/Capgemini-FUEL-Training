// console.log("I am learning the java script")


// // --------------    var    -----------------

// //Decalaration
// var a;
// //Inialization
// a=90;

// console.log(a)

// // re delcaration
// var a;

// // reinitialization
// a=9022;

// console.log(a)



// // -------------   let    -----------------



// //declaration
// let b;

// //initilization
// b=9033;

// console.log(b)

// //re delation
// //let b;

// // reinitilization
// b=9045;
// console.log(b)



// //-------------    Const   ---------------



// //declaration and inilization
// const c=93;

// // redeclaration and initization is not posssible in the const






// // 

// let ename ="Pradeep"
// console.log(typeof(ename))



// let age=20
// console.log(typeof(age))



// let balance=89562301478
// console.log(typeof(balance))



// let placed=false
// console.log(placed)


// // console.log(typeof(placed))

// let logo=Symbol("BATA")
// console.log(typeof logo)


// let f=10
// let g=10

// console.log(f==g)

// let n=Symbol(10)
// let m=Symbol(10)

// console.log(n == m)

// let sdata=["Pradeep",25,"Male"]
// console.log(sdata)

// let student={
//     name:"Pradeep",
//     age:21.4,
//     tenth:87,
//     tweth:65,
//     bca:8.85,
//     mca:"9.20 ](appering)",
//     bal: "k"
// }

// console.log(student)



// ----------------  functions --------------

// function sayhello()
// {
//     console.log("this is the sayhello");
// }

// sayhello()

// console.log(typeof(sayhello))


// ------------- Types of the Function  ----------
// -------- 1.. Name function  --any function which has a name 

// function mca()
// {
//     console.log("Pradeep taware he has pursing the master ")
//     return "This is Named Function";
// }

// console.log(mca());


// --------- 2... ANonymous Function  .... A function donst have nay name

// (function ()
// {
//     console.log("Pradeep from anonymous")
// }())


// // --------- 3 ... Function with expression .....  storing inside the variable

// let fun= function abc()
// {
//     console.log("pradeep from the function with expression")
// }


// let fun2= function abc()
// {
//     return "prdaeeo from the function eith expression with another method "
// }


// console.log(fun2())

// --------- 4... Arrow function most imp fiunction
// it is na advaesed function 
// it will reduced the syntax
// it twill implicit and explicit return 



// // case 1
// let arrow = ()=>{
//     return "I am Arraow Fn"
// }
// console.log(arrow());

// // case 2
// let arrow2=(a,b) =>
// {
//     console.log(a+b)
// }

// console.log(arrow2(9,8));

// // case 3

// let arraow3 =(a,b)=>
// {
//     return (a-b);
// }
// console.log(arraow3(23,24));


// // case 4
// let arr =a=>a*a;
// console.log(arr(6));

// callback function a function wtih  an a argument an HOF

let cf = (a,b)=>
{
    return( a+b);
}


//HSf function  hihger lorer fun ot is  afunction that will accept another 

let hof =(a,b,cf)=>{
    return cf(a,b);
}

console.log(hof(3,4,cf))


let sname=(b)=>
{
    return b+"  Hello Dear ...."
}

let greet =(b,a)=>a(b)
console.log(greet("pradeep",sname))
