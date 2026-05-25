// let object = {
//   name : "ashu",
//   age: 22,
//   city: "Indore"
// };
// for (const key in object) {
//  const element = object[key];
// console.log( key,element);
// }
// // function name(age) {
// //   console.log("hry  "    + age +" you atre greate")
// // }
// // name("132")
// // name("13d2")

// function sum(a ,b,c =3) {
//   console.log(a,b,c)
//   return a*b*c
// }
// result1 = sum(2,4)
// result2 = sum(4,4,2)
// result3 = sum(3,14)
// console.log("the product is :" ,result1)
// console.log("the product is :" ,result2)
// console.log("the product is :" ,result3)
// const funct = (a,b) =>{ 
//   // console.log("the number is",num)
//   let c = a+b
//   return c
// }
// let sm = funct(2,4)
// console.log("the number is :" ,sm)  
const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

  rl.question("Enter first number: ", (num1) => {

  rl.question("Enter second number: ", (num2) => {
  rl.question("Enter your operation number: ", (num3) => {

    num1 = Number(num1);
    num2 = Number(num2);
    num3 = Number(num3);
 if(num3 == +){
    console.log("Sum =", num1 - num2);
  rl.close();
 }
});
});
});