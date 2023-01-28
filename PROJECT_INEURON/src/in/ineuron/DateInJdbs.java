package in.ineuron;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.io.IOException;
import java.sql.*;
public class DateInJdbs {

	public static void main(String[] args) throws ParseException,SQLException{
		
		java.util.Date d= new java.util.Date();
		System.out.println(d); // this stores date along with time stamp
		long value=d.getTime(); // getting the date in terms of time i.e we get the milliseconds
		System.out.println(value);
		java.sql.Date sd= new java.sql.Date(value); // as this accept long value so thats the reason we get the time and pass it here to store it in db.
		System.out.println(sd);
		
		//now conversion of string to sql date.
		System.out.println("enter the date  in the format of dd-mm-yyyy");
		String st=new java.util.Scanner(System.in).next();
		System.out.println("entered date is "+ st);
		SimpleDateFormat sdt= new SimpleDateFormat("dd-MM-yyyy"); // case sensitive should pass dd-MM-yyyy only if we pass DD-mm-YYYY then it would parse in other way.
		java.util.Date dt=sdt.parse(st);
		long val=dt.getTime();
		java.sql.Date d1= new java.sql.Date(val);
		System.out.println(d1);
		
		// now conversion of string to date without using SimpleDateFormat object and parse method of it
		/*this is possible only if the user enters the date in a format like yyyy-MM-dd which is the default 
		format of the date.  */
		System.out.println("enter the date in the format of yyyy-MM-dd");
		String s2=new java.util.Scanner(System.in).next();
		java.sql.Date r=java.sql.Date.valueOf(s2);
		
		Connection con;
		try {
			con=JDBCCommon.getJdbcUtilConnection();
			PreparedStatement sta=con.prepareStatement("INSERT INTO INEURON.EMPLOYEE(NAME,SALARY,AGE,DT_JOIN) VALUES(?,?,?,?)");
			sta.setString(1,"shivaaaa");
			sta.setInt(2,99999);
			sta.setInt(3, 0);
			sta.setDate(4,r );
			int count=sta.executeUpdate();
			System.out.println(count);
			sta.close();
			con.close();
	
		}
		catch(SQLException | IOException e)
		{
			e.printStackTrace();
		}
		
		
		
	}
}
