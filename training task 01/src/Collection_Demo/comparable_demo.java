package Collection_Demo;
import java.util.*;
import java.io.*;

class Stu implements Comparable<Stu>{
	int regno, age;
	String name;
	
	Stu(int regno_,String name_,int age_){
		regno = regno_;
		age = age_;
		name = name_;
	}
	public int compareTo(Stu b)
	{
		if(age == b.age) {
			return name.compareTo(b.name);
			//return 0;
		}
		else if(age > b.age)
		{
			return 1;
		}
		else {
			return -1;
		}
	}
	void display() {
		System.out.println("Student "+regno+":\t"+name+"\t"+age);		
	}
}

class ageCompare implements Comparator<Stu> {
	public int compare(Stu s1, Stu s2)
	{
		//return s1.compareTo(s2);
		
		if(s1.age == s2.age) {
			return 0;
		}
		else if(s1.age > s2.age)
		{
			return 1;
		}
		else {
			return -1;
		}
		
	}
}
class nameCompare implements Comparator<Stu> {
	public int compare(Stu s1, Stu s2)
	{
		//return s1.compareTo(s2);
		
		return s1.name.compareTo(s2.name);
		
	}
}
class regCompare implements Comparator<Stu> {
	public int compare(Stu s1, Stu s2)
	{
		if(s1.regno == s2.regno) {
			return 0;
		}
		else if(s1.regno > s2.regno)
		{
			return 1;
		}
		else {
			return -1;
		}
		
	}
}
class ageNameCompare implements Comparator<Stu> {
	public int compare(Stu s1, Stu s2)
	{
		if(s1.age == s2.age) {
			return s1.name.compareTo(s2.name);
		}
		else if(s1.age > s2.age)
		{
			return 1;
		}
		else {
			return -1;
		}
		
	}
}

public class comparable_demo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<Stu> studList = new ArrayList<Stu>();
			
			studList.add(new Stu(1001,"Tin",22));
			studList.add(new Stu(1002,"Tom",21));
			studList.add(new Stu(1004,"Tim",22));
			studList.add(new Stu(1003,"Tam",23));
			
			System.out.println("== No Sort ==");
			for(Stu b:studList) {
				b.display();
			}
			System.out.println();
			System.out.println("== Basic Sort ==");
			Collections.sort(studList);
			for(Stu b:studList) {
				b.display();
			}
			System.out.println();
			System.out.println("== Name Sort ==");
			Collections.sort(studList,new nameCompare());
			for(Stu b:studList) {
				b.display();
			}
			System.out.println();
			System.out.println("== RegNo Sort ==");
			Collections.sort(studList,new regCompare());
			for(Stu b:studList) {
				b.display();
			}
			System.out.println();
			System.out.println("== Age Sort ==");
			Collections.sort(studList,new ageCompare());
			for(Stu b:studList) {
				b.display();
			}
			System.out.println();
			System.out.println("== Age,Name Sort ==");
			Collections.sort(studList,new ageNameCompare());
			for(Stu b:studList) {
				b.display();
			}
	}

}
