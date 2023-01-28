package in.ineuron;
import java.sql.*;
public class JDBCApp2 {
public static void main(String[] args) {
	
	Connection con=null;
	Statement st=null;
	try {
	
		//loading and registering Driver class is automatic from jdbc 4.x version
		String url="jdbc:mysql:///ineuron";
		String user="root";
		String password ="admin";
		con=DriverManager.getConnection(url, user, password);
		st=con.createStatement();
		boolean b=st.execute("INSERT INTO INEURON.EMPLOYEE(NAME,SALARY,AGE) VALUES('SHIVA','10000','23')");
		if(b)
		{
			// if it is true then code for result set we call st.getResultSet()
		}
		else
		{
			// if it is false then it indicates that the executed statement is non select
			
			int v=st.getUpdateCount();
			System.out.println(v);
		}
		
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	finally
	{
		try
		{
			st.close();
			con.close();}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		}
	
}
}
