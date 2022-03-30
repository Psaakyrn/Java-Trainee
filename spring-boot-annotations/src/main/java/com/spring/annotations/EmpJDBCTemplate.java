package com.spring.annotations;

import java.sql.Date;
import java.time.LocalDate;
import java.util.*;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmpJDBCTemplate implements EmpDao{

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource _ds) {
		dataSource = _ds;
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	public void create(Integer _id, String _name, LocalDate _dob, String _dept, Integer _salary) {
		String sql="insert into emp_data(emp_id, name, dob, dept, salary) values(?,?,?,?,?)";
		jdbcTemplate.update(sql,_id,_name,Date.valueOf(_dob),_dept,_salary);
		System.out.println("inserted: "+_id+" "+_name+" "+_dob.toString()+" "+_dept+" "+_salary);
	}
	public Emp getEmp(Integer _id) {
		String sql="select * from emp_data where emp_id=?";
		Emp e = jdbcTemplate.queryForObject(sql,new EmpMapper(),_id);
		
		System.out.println("retrieved Emp: "+e.getId());
		
		return e;
	}
	public List<Emp> listEmployees(){
		String sql="select * from emp_data";
		List<Emp> el = jdbcTemplate.query(sql, new EmpMapper());
		System.out.println("retrieved all Emp.");
		return el;
	}
	public void delete(Integer _id) {
		String sql="delete from emp_data where emp_id=?";
		jdbcTemplate.update(sql,_id);
		System.out.println("deleted Emp: "+_id);
	}
	public void update(Integer _id, String _name, LocalDate _dob, String _dept, Integer _salary) {
		String sql="update emp_data set name=?, dob=?, dept=?, salary=? where emp_id=?";
		jdbcTemplate.update(sql,_name,Date.valueOf(_dob),_dept,_salary,_id);
		System.out.println("updated: "+_id+" "+_name+" "+_dob.toString()+" "+_dept+" "+_salary);
	}
}
