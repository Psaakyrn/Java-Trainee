package com.spring.annotations;

import java.util.*;

import javax.sql.DataSource;
import java.time.LocalDate;

public interface EmpDao {
	public void setDataSource(DataSource _ds);
	public void create(Integer _id, String _name, LocalDate _dob, String _dept, Integer _salary);
	public Emp getEmp(Integer _id);
	public List<Emp> listEmployees();
	public void delete(Integer _id);
	public void update(Integer _id, String _name, LocalDate _dob, String _dept, Integer _salary);
}
