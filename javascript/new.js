let ar = [133,22,13,4] 
// let ar = ["soni","ashu","banna"] 
// arr.push(100,"ashu")
ar.sort((a, b) => a - b);
// ar.sort()
// console.log(ar);
// // console.log(ar.join(" and "));
// arr.forEach((value,index,arr )=>{
//   console.log(value,index,arr)
// })
let arr = {
  a:1,b:2,c:3
}
for (const key in arr) {
  if (!Object.hasOwn(arr, key)) continue;
  {
  const element = arr[key];
  
  console.log( key,element)
  }
}
for (const element of ar) {
  
  console.log(element)
}