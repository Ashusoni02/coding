let random = Math.random();
console.log(random);
let a = prompt("enter your first number: ");
let c = prompt("enter your operator : ");
let b = prompt("enter your se cond number: ");
let obj = {
  "+": "-",
  "*": "+",
  "/": "**",
  "-": "/",
};
if (random > 0.1) {
  console.log("the result is :" + a + c + b);
  alert("the result is : " + eval(a + c + b));
} else {
  console.log("the result is :" + a + c + b);
  alert(`the result is ${eval(`${a}${obj[c]}${b}`)}`);
}
