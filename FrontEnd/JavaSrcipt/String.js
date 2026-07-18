// ename="Pradeep"
// rname='Ram'
// tname=`Taware`
// // String interpolation
// console.log(`Hi my name is ${ename} my suname is ${tname}`)

// // String interpolation is not working the " "
// console.log("Hi ${ename}")


// // String interpolation is not working the ` `
// console.log(`Hi ${ename}`)



let b="Batman"

for(i=0;i<b.length;i++)
{
    let vowel=b[i]
    if(vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u' )
    {
        console.log(b[i])
    }
}