package in.ineuron;
import java.sql.*;
public class JDBCApp3 {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		try
		{
			String url="jdbc:mysql:///ineuron";
			String user="root";
			String password="admin";
			con=DriverManager.getConnection(url, user, password);
			st=con.createStatement();
			int b=st.executeUpdate("Update ineuron.employee set name='shiva' where id='4'"); // returns the no of rows affected.
			System.out.println(b);
			// now sending the data dynamically to the sql statement
			System.out.println("enter the name");
			String name=new java.util.Scanner(System.in).nextLine();
			int b2=st.executeUpdate("UPDATE INEURON.EMPLOYEE SET NAME="+"'"+name+"'"+"WHERE ID=4");
			System.out.println(b2);
			// this is one of way of sending the data dynamically but this is tedious if we have large no of values to be sent
			// another approach to sent the data dynamically is
			int b3=st.executeUpdate(String.format("UPDATE INEURON.EMPLOYEE SET NAME='%s',salary=%d",name,100022));
			System.out.println(b3);
			
			System.out.println(String.format("hi %s","srikanth"));
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				if(st!=null) st.close();
			if(con!=null)   con.close();
			}
			catch(SQLException e) {e.printStackTrace();}
				}
	}
}
