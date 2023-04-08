package in.ineuron;
import java.sql.*;
import java.io.*;
import java.text.*;
public class JdbcApp1 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement st=null;
		ResultSet rs=null;
		try
		{
			con=JDBCCommon.getJdbcUtilConnection();
			System.out.println(con.getClass().getName());
			st=con.prepareStatement("Select *  from INEURON.EMPLOYEE where dt_join is not null");
			rs=st.executeQuery();
			if(rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getInt(3));
				System.out.println(rs.getInt(4));
				SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
				java.sql.Date datee=rs.getDate(5);
				String s=sdf.format(datee); // formats a date into date-time string.
				System.out.println(s);
			}
			
		}
		catch(SQLException | IOException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{	
			try {
				if(con!=null) 	con.close();
				if(st!=null)	st.close();
				if(rs!=null) 	rs.close();
		
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
				}
	}
}
