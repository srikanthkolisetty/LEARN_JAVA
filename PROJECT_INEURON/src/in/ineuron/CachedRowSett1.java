package in.ineuron;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class CachedRowSett1 {
 public static void main(String[] args) throws SQLException {
	 
	 // two approaches 
	 RowSetFactory r= RowSetProvider.newFactory();
	 CachedRowSet c=r.createCachedRowSet();
	 Connection con= DriverManager.getConnection("jdbc:mysql:///ineuron","root", "admin");
	 c.setCommand("select * from ineuron.sample");
	 c.execute(con);
	 con.close(); // even after the connection is closed we are able to get the data in this case
	 c.next();
	 System.out.println(c.getInt(1)+" "+c.getString(2));
	 // let us see some other example where we set no command or any data we make use of populate method
	 Connection con1= DriverManager.getConnection("jdbc:mysql:///ineuron", "root", "admin");
	 PreparedStatement ps= con1.prepareStatement("select * from ineuron.sample");
	 ResultSet rs=ps.executeQuery();
	 c.populate(rs);
	 con1.close();
	 c.first();
	 System.out.println(c.getInt(1)+" "+c.getString(2));
}
}
