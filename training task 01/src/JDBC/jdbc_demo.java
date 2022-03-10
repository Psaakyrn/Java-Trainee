package JDBC;
import java.sql.*;

public class jdbc_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			
			Connection con  = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/employee","root","W0rdPa5s");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from emp_data");
			System.out.println("Obtained ResultSet");
			while(rs.next())
			{
				//System.out.println("ID: "+rs.getInt("emp_id")+"\tName: "+rs.getString("name"));
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getInt(5));
			}
			rs.close();
			con.close();
			System.out.println("End of ResultSet");
			
			
			//rs.absolute(1);  
			//System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));  		
		}
		catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
