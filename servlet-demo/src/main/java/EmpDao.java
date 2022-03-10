
import java.util.*;
import java.sql.*;
import java.sql.Date; //important, use this specific date for sql, not from util
//import java.time.LocalDate;

public class EmpDao {
	public static Connection getConnection() {
		Connection con = null;
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			
			String serverName = "localhost";
		    String mydatabase = "Employee";
		    String url = "jdbc:mysql://" + serverName + "/" + mydatabase; 

		    String username = "root";
		    String password = "MySQLPassword";
		    
			con=DriverManager.getConnection(url,username,password);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return con;
	}
	public static int save(Emp e) {
		int status = 0;
		try {
			Connection con=EmpDao.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into emp_data(emp_id, name, dob, dept, salary) values(?,?,?,?,?)");
			//System.out.println("setting: "+e.getID());
			ps.setInt(1,e.getID());
			//System.out.println("setting: "+e.getName());
			ps.setString(2,e.getName());
			//System.out.println("setting: "+e.getDoB());
			ps.setDate(3,Date.valueOf(e.getDoB()));
			//System.out.println("setting: "+e.getDept());
			ps.setString(4,e.getDept());
			//System.out.println("setting: "+e.getSalary());
			ps.setInt(5,e.getSalary());
			
			//System.out.println("executing");
			status = ps.executeUpdate();
			con.close();
		}
		catch(Exception x) {
			System.out.println(x);
		}
		
		return status;
	}
	public static int update(Emp e) {
		int status = 0;
		try {
			Connection con=EmpDao.getConnection();
			PreparedStatement ps = con.prepareStatement("update emp_data set name=?, dob=?, dept=?, salary=? where emp_id=?");
			ps.setString(1,e.getName());
			ps.setDate(2,Date.valueOf(e.getDoB()));
			ps.setString(3,e.getDept());
			ps.setInt(4,e.getSalary());
			ps.setInt(5,e.getID());
			
			status = ps.executeUpdate();
			con.close();
		}
		catch(Exception x) {
			System.out.println(x);
		}
		
		return status;
	}
	public static int delete(int id) {
		int status = 0;
		try {
			Connection con=EmpDao.getConnection();
			PreparedStatement ps = con.prepareStatement("delete from emp_data where emp_id=?");
			ps.setInt(1,id);
			
			status = ps.executeUpdate();
			con.close();
		}
		catch(Exception x) {
			System.out.println(x);
		}
		
		return status;
	}
	public static Emp getEmployeeById(int id) {
		Emp e = new Emp();
		try {
			Connection con=EmpDao.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from emp_data where emp_id=?");
			ps.setInt(1,id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				//System.out.println("Retrieving data for "+rs.getInt(1));
				e.setID(rs.getInt(1));
				e.setName(rs.getNString(2));
				e.setDoB(rs.getDate(3).toLocalDate());
				e.setDept(rs.getNString(4));
				e.setSalary(rs.getInt(5));
			}
			
			
			con.close();
		}
		catch(Exception x) {
			System.out.println(x);
		}
		
		return e;
	}
	public static int getEmployeeTotal() {
		int total = 0;
		try {
			Connection con=EmpDao.getConnection();
			PreparedStatement ps = con.prepareStatement("select count(*) from emp_data");
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				//System.out.println("Retrieving data for "+rs.getInt(1));
				total=rs.getInt(1);
			}
			
			
			con.close();
		}
		catch(Exception x) {
			System.out.println(x);
		}
		
		return total;
	}
	public static List<Emp> getAllEmployees() {
		List<Emp> el = new ArrayList<Emp>();
		try {
			Connection con=EmpDao.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from emp_data");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Emp e = new Emp();
				e.setID(rs.getInt(1));
				e.setName(rs.getNString(2));
				e.setDoB(rs.getDate(3).toLocalDate());
				e.setDept(rs.getNString(4));
				e.setSalary(rs.getInt(5));
				el.add(e);
			}
			
			
			con.close();
		}
		catch(Exception x) {
			System.out.println(x);
		}
		
		return el;
	}
	public static List<Emp> getAllEmployees(int start, int total) {
		List<Emp> el = new ArrayList<Emp>();
		try {
			Connection con=EmpDao.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from emp_data limit "+(start)+","+total);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Emp e = new Emp();
				e.setID(rs.getInt(1));
				e.setName(rs.getNString(2));
				e.setDoB(rs.getDate(3).toLocalDate());
				e.setDept(rs.getNString(4));
				e.setSalary(rs.getInt(5));
				el.add(e);
			}
			
			
			con.close();
		}
		catch(Exception x) {
			System.out.println(x);
		}
		
		return el;
	}
}
