package in.ineuron;
import java.sql.*;
import java.sql.DriverManager;

public class Csv { //name should be followed pascal case
	public static void main(String[] args) {
		
		try(Connection con=DriverManager.getConnection("jdbc:Text:///D:\\Java_Course_Res\\live_class_docs\\20th Jan FSJAVA\\data.csv"))
		{
			if(con!=null)
			{
				try(Statement st= con.createStatement())
				{
					if(st!=null)
						{
						ResultSet rs= st.executeQuery("SELECT * FROM data");
							if(rs!=null)
							{
								while(rs.next())
								{
									System.out.println(rs.getInt(1));
									System.out.println(rs.getString(2));
									System.out.println(rs.getString(3));
								}
							}
						}
					}
				}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}
