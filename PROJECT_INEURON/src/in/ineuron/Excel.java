package in.ineuron;
import java.sql.*;
import java.io.*;
public class Excel {
	public static void main(String[] args) {
		
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try
		{
			con=DriverManager.getConnection("jdbc:Excel:///D:\\Java_Course_Res\\live_class_docs\\20th Jan FSJAVA\\data.xlsx");
			if(con!=null)	st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			if(st!=null)  rs=st.executeQuery("Select * from student");
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
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}
