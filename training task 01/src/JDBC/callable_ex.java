package JDBC;
import java.sql.*;

public class callable_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/employee","root","W0rdPa5s");
			
			String query = "call find_emp_sal_range(?,?)";
			
			/*
mysql> create procedure find_emp_sal_range(in min_sal int, in max_sal int)
   	-> begin
   	-> select * from emp_data where salary >= min_sal and salary <= max_sal;
			 */
			CallableStatement st = con.prepareCall(query);
			
			st.setInt(1, 24200);
			st.setInt(2, 26000);
			ResultSet rs = st.executeQuery();
			System.out.println("Obtained ResultSet");
			while(rs.next())
			{
				//System.out.println("ID: "+rs.getInt("emp_id")+"\tName: "+rs.getString("name"));
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getInt(5));
			}
			query="call find_stud_in_year(?)";
			st = con.prepareCall(query);
			st.setInt(1, 2020);
			rs = st.executeQuery();
			System.out.println("Obtained ResultSet");
			while(rs.next())
			{
				//System.out.println("ID: "+rs.getInt("emp_id")+"\tName: "+rs.getString("name"));
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
			}			
			rs.close();
			con.close();
			System.out.println("End of ResultSet");

		}
		catch(Exception e)
		{
			System.out.println (e);
			
			
		}

	}

}
