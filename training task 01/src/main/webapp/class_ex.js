/**
 * 
 */
 
 class Emp{
	/*
	let name="";
	let age=0;
	let salary=0;
	*/
	
	constructor(name, age, salary)
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	getName(){return this.name;}
	getAge(){return this.age;}
	getSalary(){return this.salary;}
	getPf(){return this.salary*12/100;}
}
class Report extends Emp{
	display(){
		console.log("Name: "+this.name);
		console.log("Age: "+this.age);
		console.log("Salary: "+this.salary);
		console.log("PF: "+this.getPf());
	}
	constructor(_emp){
		super(_emp.getName(),_emp.getAge(),_emp.getSalary());
		//this.name=_emp.getName();
		//this.age=_emp.getAge();
		//this.salary=_emp.getSalary();
	}
}

const e1 = new Emp("sachin",35,25000);
const r1 = new Report(e1);

console.log(e1.getName());
console.log(e1.getAge());
console.log(e1.getSalary());
console.log(e1.getPf());
r1.display();
