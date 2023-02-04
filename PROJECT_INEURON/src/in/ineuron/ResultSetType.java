package in.ineuron;
import java.io.*;
import java.sql.*;
public class ResultSetType {
public static void main(String[] args) {
	
	Connection con=null;
	Statement st=null;
	ResultSet rs=null;
	try
	{
		con=JDBCCommon.getJdbcUtilConnection();
		if(con!=null)	st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		if(st!=null) 	rs=st.executeQuery("SELECT * FROM INEURON.SAMPLE");
		if(rs!=null)
		{
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
		}
		//now navigating from back to starting rows
		while(rs.previous())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}
		//now moving the cursor to the first row 
		rs.first();
		System.out.println(rs.getInt(1)+" "+ rs.getString(2));
		rs.last();
		System.out.println(rs.getInt(1)+" "+rs.getString(2));
		// now to move to a particular row from begining of the row irrespective of the cursor posiiton.
		rs.absolute(3);  // rs.absolute(-1) points to the last row , rs.absolute(-2) points to the last second row.
		// now if we want to get the row from current cursor position i.e means from current cursor position move downwards
		System.out.println(rs.relative(2)); // returns true if it points to row else false
	//	System.out.println(rs.getInt(1)+" "+rs.getString(2)); // now getting the data from the row for which result set cursor points.
		
		//36 line gives exception because rs.relative(20) is not pointing to a row.
		System.out.println(rs.relative(-1)); // it is equal to rs.previous()
		System.out.println(rs.absolute(0)); // it means before first row which has no row at that position
		//System.out.println(rs.getInt(1));
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
