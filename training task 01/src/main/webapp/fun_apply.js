/**
 * 
 */
const person = {
	fullName:function()
	{
		return this.firstName+" "+this.lastName;
	}
}
const person1={
	firstName:"hello",
	lastName:"world"
}
const person2={
	firstName:"welcome",
	lastName:"earth"
}

console.log(person.fullName.apply(person1));
console.log(person.fullName.apply(person2));