package in.ineuron;
import java.io.*;
import java.sql.*;
public class Procedure {

	public static void main(String[] args) {
		Connection con=null;
		CallableStatement c=null;
		ResultSet rs=null;
		boolean flag=false;
		try
		{
			con=JDBCCommon.getJdbcUtilConnection();
			if(con!=null)	c=con.prepareCall("{ call ineuron.fetch() }");
			if(c!=null)		c.execute(); //as there are not out parameters no need to  register any out put parameters
			rs=c.getResultSet();
			if(rs!=null)
			{
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getInt(3)
					+""+rs.getInt(4)+""+rs.getDate(5)+""+rs.getBinaryStream(6)+""+rs.getCharacterStream(7));
					flag=true;
				}
				// result object gets created even if there are no records returned.
			}
			if(flag==false)
			{
				System.out.println("no rows fetched");
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
				con.close();
				rs.close();
				c.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
}
