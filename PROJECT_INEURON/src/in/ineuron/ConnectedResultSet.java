package in.ineuron;
import java.io.*;
import java.sql.*;
import javax.sql.*;
public class ConnectedResultSet {
public static void main(String[] args) {
	//by default resultset is connected
	//if the connection is closed then we can't access it
	
	try(Connection con= JDBCCommon.getJdbcUtilConnection())
	{
		if(con!=null)
		{
			PreparedStatement st=con.prepareStatement("select * from ineuron.sample");
			ResultSet rs=st.executeQuery();
			con.close();
			rs.next();
			System.out.println(rs.getInt(1)); // we get a sql exception saying resultset closed and cannot perform an operation 
		}
	}
	catch(SQLException |IOException e)
	{
		e.printStackTrace();
	}
}
}
