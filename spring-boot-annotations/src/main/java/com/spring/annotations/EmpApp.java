package com.spring.annotations;

import java.time.LocalDate;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		EmpJDBCTemplate empJDBC = (EmpJDBCTemplate)context.getBean("empJDBC");

		System.out.println("-- create record --");
		empJDBC.create(501,"Zim",LocalDate.parse("2020-04-05"),"HR",24424);
		
		System.out.println("-- list all records --");
		List<Emp> el = empJDBC.listEmployees();
		for(Emp e:el)
		{
			System.out.println("Listing: "+e.toString());
		}
		
		System.out.println("-- update record --");
		empJDBC.update(501,"Zom",LocalDate.parse("2021-04-01"),"HR",24000);
		
		
		System.out.println("-- get record --");
		Emp e2 = empJDBC.getEmp(501);
		System.out.println("Retrieved: "+e2.toString());
		
		System.out.println("-- delete record --");
		empJDBC.delete(501);
		
	}

}
