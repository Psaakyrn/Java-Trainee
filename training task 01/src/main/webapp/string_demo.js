/**
 * 
 */
 
var x = "  welcome to to \"JS\" ";
var y = 'Training\tsession';
var z = '\n hi! \n'
var str = new String(x+y);

console.log("String 1 + string 2: "+x + y);
console.log("all strings: "+x +z+ y);

console.log("Length of string 1 + string 2:" +(x+y).length);
console.log("slice1: "+(x+y).slice(5,15));
console.log("slice2: "+str.slice(-20));
console.log(str.replace("JS","Javascript"));
console.log(str.toUpperCase());
console.log(str.toLowerCase());
console.log(str.trim());
console.log(str.concat("moooo?"));
console.log("index 5: "+str.charAt(5));
console.log("index to: "+str.indexOf("to"));

let n=0;
function sum(){
	let n=0;
	console.log(n+=2);
}
sum();
sum();
sum();
console.log("n = "+n)



