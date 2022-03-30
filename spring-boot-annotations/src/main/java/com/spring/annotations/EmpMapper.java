package com.spring.annotations;

import java.sql.*;
import org.springframework.jdbc.core.RowMapper;

public class EmpMapper implements RowMapper<Emp>{

	public Emp mapRow(ResultSet rs, int rowNum) throws SQLException{
		//Emp e = null;
		
			//e.setId(rs.getInt(1));
			//e.setName(rs.getNString(2));
			//e.setDobLocal(rs.getDate(3).toLocalDate());
			//e.setDept(rs.getNString(4));
			//e.setSalary(rs.getInt(5));
		Emp e=new Emp(rs.getInt(1),rs.getNString(2),rs.getDate(3).toLocalDate(),
					rs.getNString(4),rs.getInt(5));
		
		return e;
	}

}
