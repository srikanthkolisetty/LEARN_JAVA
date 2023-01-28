package in.ineuron;
import java.sql.*; //explicit import
public class JDBCApp {

	public static void main(String[] args) {
		
		Connection con=null;
		try
		{
			String url="jdbc:mysql:///ineuron";
			String user="root";
			String password="admin";
			con=DriverManager.getConnection(url, user, password);
			System.out.println("connection established");
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
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				con.close();
			}
			catch(SQLException e)
			{
				
			}
			}
		
	}
}
