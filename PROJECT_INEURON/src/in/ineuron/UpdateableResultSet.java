package in.ineuron;
import java.sql.*;
import java.io.*;
public class UpdateableResultSet {

	public static void main(String[] args) {
		
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try
		{
			con=JDBCCommon.getJdbcUtilConnection();
			if(con!=null)	st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			if(st!=null) 	rs=st.executeQuery("SELECT * FROM INEURON.SAMPLE");
			if(rs!=null)	
			{
				rs.first(); // making the result set cursor to point to first row
				/* now let us perform delete operation and this deletion of record will also
				effect the database i.e the same row will be deleted in database also.
				*/
				rs.deleteRow();
			}
			// now at present resultset cursor points to the before first row
			// at this posiiton let us insert a row
			rs.moveToInsertRow(); // creates a empty record in buffer
			rs.updateInt(1, 91);
			rs.updateString(2, "father"); // these two update methods are used to insert the data.
			rs.insertRow(); // this method is now insert the record in result set and in database.
			rs.last(); // making the resultset cursor to point the last row
			rs.updateInt(1, 48);
			rs.updateString(2, "last");
			rs.updateRow();
			
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
			try
			{
				con.close();
				st.close();
				rs.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
