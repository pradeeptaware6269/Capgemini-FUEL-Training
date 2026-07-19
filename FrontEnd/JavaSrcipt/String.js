// ename="Pradeep"
// rname='Ram'
// tname=`Taware`
// // String interpolation
// console.log(`Hi my name is ${ename} my suname is ${tname}`)

// // String interpolation is not working the " "
// console.log("Hi ${ename}")


// // String interpolation is not working the ` `
// console.log(`Hi ${ename}`)



// let b="Batman"

// for(i=0;i<b.length;i++)
// {
//     let vowel=b[i]
//     if(vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u' )
//     {
//         console.log(b[i])
//     }
// }


// let str= "    Elon Musk  ";
// console.log(str)
// console.log(str.toLowerCase())
// console.log(str.toUpperCase())

// console.log(str.trimEnd())
// console.log(str.trimStart())
// console.log(str.trim())

// console.log("Replacing the chracter of the E to  P :"+str.replace('E','P'))
// console.log("The length of the STring is :"+str.length)

// let username="     pradeeptaware@gmail.com  "

// console.log(username.split(" "))
// console.log(username.split("@"))
// console.log(username.split("    "))


// let fname="imran";
// let mname="Sharukha";
// let lname="Khan";
// console.log(fname.concat(" " +lname+" ",mname))



// let college="indira College";
// console.log(college.indexOf('i'));
// console.log(college.lastIndexOf('e'));


// let email=  "Pradeep@gmail.com";
// console.log(email.includes("@"))
// console.log(email.charAt(4))
// console.log(email.charCodeAt(0))
// console.log(String.fromCharCode(65))


// // // -------   Password Validator  ---------

// let passowrdValidator=()=>
// {
//     let password=String(prompt("Enter the Passowrd Here : "));
//     if(password.length >= 8)
//     {
//         console.log("Password length is correct ");
    
//         if ([A-Z].test(password))
//         {
//             console.log("Your Passowrd contained the At least Upper Case letter ... ");
        
//         if ([a-z].test(password))
//         {
//             console.log("Your passowrd Contined the at least Lower Case letter ... ");
    
//         if (\d.test(password))
//         {
//             console.log("Your password Contined the atleast 1 digit ...");
//             console.log("Strong Passowrd .....")     
//         }
//     }
//     }
//     }
//     else{
//         console.log("Weak Passsowrd ...") 
//     }
// }
// passowrdValidator();



// // count the digits

// let str=String(prompt("Enter the STring Here :"))

// let alpheCount=0;
// let speciCount=0;
// let digitCount=0;
// for(let i=0;i<=str.length;i++)
// {
//     ch = str[i];
//     if([a-z].test(ch) || [A-Z].test(ch))
//     {
//         alpheCount++;
//     }
//     else if([0-9].test(ch))
//     {
//         digitCount++;
//     }

//     else{
//         speciCount++;
//     }


// }

// console.log("The total Alphabets is :"+alpheCount)
// console.log("The total digits is :"+digitCount)
// console.log("The total special Symbols is :"+speciCount)



// // Duplicate Characers 

// let str=String(prompt("Enter the STring here  :"))
// for(let i=0;i<str.length;i++)
// {
//     let count=0;
//     for(let j=0;j<str.length;j++)
//     {
//         if(str[i] == str[j])
//         {
//             count++;
//             if(count >1)
//             {
//             console.log("Duplicate Charterter :"+str[i])
//         }
//     }
//     }
// }


// let input="Vii00t@123";
// let cap=false;
// let small=false;
// let special=false;
// let digit=false;

// if(input.length > 8)
// {
//     for(i=0;i<input.length;i++)
//     {
//         if(input[i] >= "A" && input[i]<="Z")
//         {
//             cap=true;
//         }
//         else if(input[i] >= "a" && input[i]<="z")
//         {
//             small=true;
//         }
//         else if(input[i] >= 0 && input[i]<=9)
//         {
//             digit=true;
//         }
//         else{
//             special=true;
//         }
//     }
// }
// if(cap && small && digit && special)
// {
//     alert("Strong Passwprd ..... ")
// }
// else{
//     alert("Weak Passsord .... ")
// }



// let str= "Java is an amezing lanuagage";
// let str1=str.split(" ");



let con=["Swis","Ind","Jap","pak","Swis","US","Rashiya","Ukren"];
// console.log(con)


// // ------- 1 for in
// for(let i in con)
// {
//     console.log(i)
// }
// // -------- 2 for of
// for(let i of con)
// {
//     console.log(i)
// }
// // --------- 3  for each
// con.forEach((item,index)=>
// {
//     console.log(item,index)
// })




// push
con.push("Japan")

// pop
con.pop()

// unshift
con.unshift("pak")

// indexOf
console.log(con.indexOf("Swis"))

//lastindexIndexOf
console.log(con.lastIndexOf("Swis"))

// join
let fullname=["Pradeep","Taware"]
console.log(fullname)
console.log(fullname.join(" "))

// map
let salary=[50000,34000,45000,9000]
let updatedSalary=salary.map((value,index)=>{
    return value+11000;
})

console.log(salary)
console.log(updatedSalary)


// filter
let data=salary.filter(s => s < 50000);
console.log(data);


// reduce
let expence =salary.reduce((i,value)=>
{
    return i+value;
})

console.log(expence)