package in.ineuron;
import java.sql.*;
import java.io.*;
import java.util.Properties;
public class JDBCCommon {
	
	private JDBCCommon()
	{
		
	}
	
	 public static  Connection getJdbcUtilConnection() throws SQLException,FileNotFoundException,IOException
	 {
		 FileInputStream f= new FileInputStream("../PROJECT_INEURON/src/in/ineuron/application.properties");
		 Properties p= new Properties();
		 p.load(f);
		 return DriverManager.getConnection(p.getProperty("url"),p.getProperty("username"),
				 p.getProperty("password"));
	 }
	 
	 public static void cleanUp(Connection con,ResultSet rs)
	 {
		try {
				if(con!=null)	con.close();
				if(rs!=null)	rs.close();
		}
			 catch(SQLException e)
			 {
				 e.printStackTrace();
			 }
			 }
	 }

