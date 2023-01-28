package in.ineuron;
import java.io.*;
import java.sql.*;
public class Prepare {
 public static void main(String[] args) throws IOException,SQLException{
	
	 Connection con=null;
	 try {
		 
		 con=JDBCCommon.getJdbcUtilConnection();
		 String query="INSERT INTO INEURON.COURSE(ID,NAME) VALUES(?,?)";
		 PreparedStatement st=con.prepareStatement(query);
		 /* line 11 gives the precompiled query object for which we set the values using that object and that object 
		  internally sets the values to the query it has */
		 st.setInt(1, 102);
		 st.setString(2,".net");
		 int count=st.executeUpdate();
		 // now the same query can be executed again by passing some other values.
		 // For the next time compilation will not happen only execution happens
		 st.setInt(1, 303);
		 st.setNString(2, "cloud");
		 int count2=st.executeUpdate();
		 
		 System.out.println(count+" "+count2);		 
		 st=con.prepareStatement("SELECT * FROM INEURON.EMPLOYEE");
		 
	 }
	 finally
	 {
		 try {
			 con.close();
		 }
		 catch(SQLException e)
		 {
			 e.printStackTrace();
		 }
	 }
}
}
