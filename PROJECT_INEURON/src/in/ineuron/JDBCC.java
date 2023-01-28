package in.ineuron;
import java.sql.*;
public class JDBCC {

	public static void main(String[] args) {
		
		Connection con=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver"); // if this loaded successfulle=y then only we can establish the connection 
			System.out.println("successfully loaded");
			// the loading this class had become optional from jdbc 4.x 
			String url="jdbc:mysql://localhost:3306/ineuron"; //jdbc - protocol, mysql - engine name
			con=DriverManager.getConnection(url,"root","admin");
			System.out.println(con.getClass().getName());		
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("SELECT * FROM INEURON.EMPLOYEE");
			while(rs.next())
			{
				int id=rs.getInt("id"); // we should pass either column name or column index.Recommended approach is column name
				String name=rs.getString(2);
				int salary=rs.getInt(3);
				int age = rs.getInt(4);
				System.out.println(id+"\t"+name+"\t"+salary+"\t"+age);
			}
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();;
		}
		finally
		{
			if(con!=null)
			{
				try
				{
					con.close();
					
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
			}
		}
		
	}
}
