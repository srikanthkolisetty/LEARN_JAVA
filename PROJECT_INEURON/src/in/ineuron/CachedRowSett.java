package in.ineuron;

import java.sql.SQLException;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class CachedRowSett {
	public static void main(String[] args) throws SQLException {
		
		RowSetFactory r= RowSetProvider.newFactory();
		CachedRowSet c= r.createCachedRowSet();
		c.setUrl("jdbc:mysql:///ineuron");
		c.setUsername("root");
		c.setPassword("admin");
		c.setCommand("Select * from ineuron.sample");
		c.execute();
		c.beforeFirst();
		c.close();
		c.next(); // just to get one row not using while loop
		System.out.println(c.getInt(1)+" "+c.getString(2));
		
		
		
	}

}
