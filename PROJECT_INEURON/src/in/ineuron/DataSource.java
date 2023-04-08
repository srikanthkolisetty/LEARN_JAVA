package in.ineuron;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;


public class DataSource {
 
	public static void main(String[] args) throws SQLException {
		
		MysqlConnectionPoolDataSource data = new MysqlConnectionPoolDataSource();
		data.setURL("jdbc:mysql:///ineuron");
		data.setUser("root");
		data.setPassword("admin");
		//getting the connection object from the connection pool
		Connection con = data.getConnection();
		Statement st = con.createStatement();
		ResultSet rs= st.executeQuery("select * from studentj");
		while(rs.next())
		{
			System.out.println(rs.getString("name"));
		}
		con.close();
	}
}
