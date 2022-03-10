/**
 * 
 */
 

 console.log("hello earth", (4+5));
 console.log(99.45);
 
document.getElementById("e1").innerHTML="Welcome!";
const x = document.getElementsByClassName("e2");
document.getElementById("e3").innerHTML="Paragraph 1 index is: "+x[1].innerHTML;
document.getElementsByClassName("e2")[0].innerHTML="ddd!";

function change(){
	document.getElementsByClassName("e2")[1].innerHTML="boop";
}
/*
function change2(){
	console.log("hi console");
	document.write("why am I writing this...");
	window.alert("popup!");
}
*/
function change2(){
	var x = 10;
	var y = x;
	console.log("y += "+y);
	x = 1.1;
	y += x;
	console.log("y += "+y);
	x = "1.2";
	y += x;
	console.log("y += "+y);
	x = 1.3;
	y += x;
	console.log("y += "+y);
	x = 1.4;
	y += x;
	console.log("y += "+y);
	const z = y;
	console.log("z += "+z);
	
	/*
	{
	var a = 0
	let b = 0
	}
	
	console.log("a += "+a);
	console.log("b += "+b);		
	*/
}

