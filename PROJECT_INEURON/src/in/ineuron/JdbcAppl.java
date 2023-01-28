package in.ineuron;
import java.sql.*;
import java.io.*;
public class JdbcAppl {
	public static void main(String[] args) throws IOException {
		
		try
		{	Statement st=null;
			ResultSet rs=null;
			Connection con=JDBCCommon.getJdbcUtilConnection();
			if(con!=null)	 st=con.createStatement();
			if(st!=null)	 rs=st.executeQuery("Select * from ineuron.employee");
			while(rs.next())
			{
				System.out.printf("%d %s %d %d",rs.getInt("id"),rs.getString("name"),rs.getInt("salary")
						,rs.getInt("age"));
				System.out.println();
			}
			if(st!=null)	st.close();
			JDBCCommon.cleanUp(con, rs);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		
	}

}
