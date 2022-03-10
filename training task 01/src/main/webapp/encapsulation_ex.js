/**
 * 
 */
 class Emp{	
	constructor()
	{
		var name="";
		var age=-1;
		var salary=-1;
	}
	getName(){return this.name;}
	getAge(){return this.age;}
	getSalary(){return this.salary;}
	
	getPf(){return this.salary*12/100;}
	
	setName(_name){this.name=_name;}
	setAge(_age){this.age=_age;}
	setSalary(_salary){this.salary=_salary;}

	display(){
		console.log("Name: "+this.name);
		console.log("Age: "+this.age);
		console.log("Salary: "+this.salary);
		console.log("PF: "+this.getPf());
	}
}

class Report extends Emp
{
	display(){
		console.log("Report display:")
		console.log("Name: "+this.name);
		console.log("Age: "+this.age);
		console.log("Salary: "+this.salary);
		console.log("PF: "+this.getPf());
	}
} 

var e1 = new Report();
e1.setName("tim");
e1.setSalary(24500);
e1.setAge(32);

e1.display();
