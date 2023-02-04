package in.ineuron;
import java.io.*;
import java.sql.*;
public class Blobb {

	public static void main(String[] args) throws IOException{
		
		Connection con=null;
		PreparedStatement st =null;
		try
		{
			con=JDBCCommon.getJdbcUtilConnection();
			st=con.prepareStatement("Insert into ineuron.employee(name,salary,age,dt_join,image,pdf) values(?,?,?,?,?,?)");
			st.setString(1, "lokesh");
			st.setInt(2, 100000);
			st.setInt(3, 18);
			System.out.println("enter the date in format yyyy-mm-dd");
			java.sql.Date dt= java.sql.Date.valueOf(new java.util.Scanner(System.in).next());
			st.setDate(4, dt);
			st.setBinaryStream(5, new FileInputStream("C:\\Users\\admin\\Pictures\\Screenshots\\Screenshot (221).png"));
			st.setCharacterStream(6, new FileReader("D:\\history.pdf"));
			int count = st.executeUpdate();
			System.out.println(count);
		}
		catch(SQLException | FileNotFoundException e )
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
				if(con!=null)	con.close();
				if(st!=null)st.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}	}
	}
}
