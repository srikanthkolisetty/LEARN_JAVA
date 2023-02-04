package in.ineuron;
import java.sql.*;
import java.io.*;
import java.util.Scanner;
public class Batch {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement st=null;
		Scanner sc= new Scanner(System.in);
		try {
			con=JDBCCommon.getJdbcUtilConnection();
			st=con.prepareStatement("INSERT INTO SAMPLE VALUES(?,?)");
			while(true)
			{	
				System.out.println("want to continue? please enter yes or no");
				if(sc.next().equalsIgnoreCase("no"))	break;
				System.out.println("enter the id and name");
				st.setInt(1, sc.nextInt());
				st.setString(2, sc.next());
				st.addBatch();
			}
			if(st!=null)	
				{
				int[] b=st.executeBatch();
				for(int d:b)
				{
					System.out.println(d);
				}
		
				}
		}
		catch(SQLException | IOException e)
		{
			
		}
	}

}
