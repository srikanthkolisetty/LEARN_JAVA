package in.ineuron;
import java.sql.SQLException;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.FilteredRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.JoinRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.WebRowSet;

public class RowSett {

	public static void main(String[] args) throws SQLException {
		
		RowSetFactory rs= RowSetProvider.newFactory();
		JdbcRowSet jrs= rs.createJdbcRowSet(); // same as resultset it is not serializable but scrollable , updateable
		CachedRowSet crs=rs.createCachedRowSet();
		WebRowSet wrs= rs.createWebRowSet();
		JoinRowSet jors= rs.createJoinRowSet();
		FilteredRowSet frs= rs.createFilteredRowSet();
		System.out.println(jrs.getClass().getName());
		jrs.setUrl("jdbc:mysql:///ineuron");
		jrs.setUsername("root");
		jrs.setPassword("admin");
		jrs.setCommand("select * from ineuron.sample");
		jrs.execute();
		//jrs.close(); if we invoke this method the statements after this are not executable
		jrs.absolute(-1);
		System.out.println(jrs.getInt(1)+" "+ jrs.getString(2));
		jrs.moveToInsertRow();
		jrs.updateInt(1, 26);
		jrs.updateString(2, "mangu");
		jrs.insertRow(); // after this new row rowset points to the new row only
		//jrs.setCommand("insert into ineuron.sample values(1,'kk')"); insert commands can't be invoked
		//jrs.execute();
		// the line 33 and 34 operations are invalid
		jrs.updateString(2, "mm");
		jrs.updateRow();
		jrs.absolute(1);
		System.out.println(jrs.getInt(1)+" "+jrs.getString(2));
		jrs.updateString(2,"kasii");
		jrs.updateRow();
		System.out.println(jrs.getInt(1)+" "+ jrs.getString(2));
		jrs.absolute(-1);
		jrs.updateString(2,"manu");
		jrs.updateRow();
		
		
	}
}
