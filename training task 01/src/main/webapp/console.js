/**
 * 
 */
 /*
 	var x = 10;
	var y = x;
	console.log("y += "+y);
	x = 1.1;
	y += x;
	console.log("y += "+y);
	x = 2
	y -= x;
	console.log("y += "+y);
	x = 2;
	y /= x;
	console.log("y += "+y);
	x = 1.4;
	y *= x;
	console.log("y += "+y);
	const z = y;
	console.log("z += "+z);
	console.log(9332654729891549);
	console.log(9007199254740992);
	console.log(9007199254740993);
	console.log(9007199254740994);
	*/
	var arrowf=()=>console.log("arrowd");
	
	arrowf();
	
	var arrowConsolef=(x,y)=>console.log("arrowf: "+x*y);
	
	function calc(x,functionInput)
	{
		functionInput(x,x);
	}
	calc(8,arrowConsolef);
	
	emp_id = new Array(101,202,303,404,505);
	console.log(emp_id);
	console.log("push "+emp_id.push(606));
	for(i=0;i<emp_id.length;i++){
		console.log("loop 1: "+emp_id[i]);
	}
	console.log("pop "+emp_id.pop());
	for(i=0;i<emp_id.length;i++){
		console.log("loop 2: "+emp_id[i]);
	}
	console.log("Shift "+emp_id.shift());
		for(i=0;i<emp_id.length;i++){
		console.log("loop 3: "+emp_id[i]);
	}
	delete emp_id[1];
	console.log("delete element 1 ");
		for(i=0;i<emp_id.length;i++){
		console.log("loop 4: "+emp_id[i]);
	}
	console.log("unshift "+emp_id.unshift(909));
		for(i=0;i<emp_id.length;i++){
		console.log("loop 5: "+emp_id[i]);
	}
	console.log("splice (add)");
	emp_id.splice(2,1,707,808)
	for(i=0;i<emp_id.length;i++){
		console.log("loop 5: "+emp_id[i]);
	}
	console.log("splice (remove)");
	emp_id.splice(2,2)
	for(i=0;i<emp_id.length;i++){
		console.log("loop 5: "+emp_id[i]);
	}
	emp_name = new Array("Tim","Sim","Vim");
	console.log(emp_name.sort());
	console.log(emp_name.sort().reverse());
	
	console.log(emp_id.sort(function(a, b){return a-b}));
	console.log(emp_id.sort(function(a, b){return b-a}));
	
