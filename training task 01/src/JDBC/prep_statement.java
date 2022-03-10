package JDBC;
import java.sql.*;

public class prep_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/employee","root","W0rdPa5s");
			PreparedStatement st = con.prepareStatement("insert into emp_data values(?,?,?,?,?)");
			/*st.setInt(1,3002);
			st.setString(2,"Honna");
			st.setString(3,"2000-06-30");
			st.setString(4,"HR");
			st.setInt(5,23200);
			int i = st.executeUpdate();
			System.out.println(i+" records updated.");*/
			int i =0;
			for(int j = 0; j<3;j++)
			{
				st.setInt(1,210+j);
				st.setString(2,"Nunba "+(j*10));
				st.setString(3,"2000-02-"+(10+j));
				st.setString(4,"PR ("+j+")");
				st.setInt(5,24000+(j*100));
				i+= st.executeUpdate();
			}
			System.out.println(i+" records updated.");
			//ResultSet rs = st.executeUpdate();
			//System.out.println("Obtained ResultSet");
			/*while(rs.next())
			{
				//rs.getInt()
				//System.out.println("ID: "+rs.getInt("emp_id")+"\tName: "+rs.getString("name"));
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getInt(5));
			}
			rs.close();*/
			con.close();
			//System.out.println("End of ResultSet");
			
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

	}

}
