package in.ineuron;
import java.io.*;
import java.sql.*;
import java.util.Scanner;
public class StatementBatch {
public static void main(String[] args) {
	Connection con=null;
	Statement st=null;
	Scanner sc= new Scanner(System.in);
	try {
		con=JDBCCommon.getJdbcUtilConnection();
		st=con.createStatement();
		int id;
		String name;
		while(true)
		{	
			System.out.println("want to continue? please enter yes or no");
			if(sc.next().equalsIgnoreCase("no"))	break;
			System.out.println("enter the id and name");
			id=sc.nextInt();
			name=sc.next();
			st.addBatch(String.format("INSERT INTO  INEURON.SAMPLE VALUES(%d,'%s')",id,name));
			// the above line is how we do addBatch for statement object.
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
		e.printStackTrace();
	}
	catch(Exception w)
	{
		w.printStackTrace();
	}
	
}
}
