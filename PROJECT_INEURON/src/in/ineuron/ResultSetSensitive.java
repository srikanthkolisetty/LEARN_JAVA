package in.ineuron;
import java.sql.*;
import java.io.*;
public class ResultSetSensitive {

	public static void main(String[] args) {
	Connection con=null;
	ResultSet rs=null;
	Statement st=null;
	try
	{
		con=JDBCCommon.getJdbcUtilConnection();
		if(con!=null)	st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		if(st!=null)	rs=st.executeQuery("SELECT * FROM INEURON.SAMPLE");
		if(rs!=null)
		{
			while(rs.next())
			{
				rs.refreshRow();
				System.out.println("enter any input to resume running the program");
				System.in.read();
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
			// it can only identifies the updates that happen to the rows which it has fetched at starting 
			// can't identify or fetch new rows.
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
}
}
