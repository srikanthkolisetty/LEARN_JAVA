package in.ineuron;
import java.sql.*;
import java.io.*;
public class Stored {
public static void main(String[] args) {
	
	Connection con=null;
	CallableStatement ca=null;
	try
	{
		con=JDBCCommon.getJdbcUtilConnection();
		ca=con.prepareCall("{call ineuron.temp(?,?,?,?)}");
		ca.setInt(1, 8);
		ca.registerOutParameter(2,Types.VARCHAR);
		ca.registerOutParameter(3, Types.INTEGER);
		ca.registerOutParameter(4,Types.INTEGER);
		ca.execute();
		System.out.println(ca.getString(2));
		System.out.println(ca.getInt(3));
		System.out.println(ca.getInt(4));
	}
	catch(SQLException | IOException e)
	{
		e.printStackTrace();
	}
	finally
	{
		try
		{
			if(con!=null) con.close();
			if(ca!=null)	ca.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
}
