package in.ineuron;
import java.sql.*;
import java.io.*;
import java.util.*;
import java.text.*;
public class GetBlob {
	
public static void main(String[] args) {
	Connection con=null;
	PreparedStatement st=null;
	ResultSet rs=null;
	try
	{
		FileReader r= new FileReader("../PROJECT_INEURON/src/in/ineuron/application.properties");
		Properties p= new Properties();
		p.load(r);
		con=DriverManager.getConnection("jdbc:mysql:///ineuron",p.getProperty("username"),p.getProperty("password"));
		if(con!=null)	st=con.prepareStatement(String.format("SELECT * FROM INEURON.EMPLOYEE WHERE NAME='%s'","lokesh"));
		if(st!=null)	rs=st.executeQuery();
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-mm-dd");
		String date=null;
		InputStream is=null;
		FileOutputStream fo=null;
		Reader r1=null;
		PrintWriter pw=null;
		while(rs.next())
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
			System.out.println(rs.getInt(4));
			date=sdf.format(rs.getDate(5));
			is=rs.getBinaryStream(6);
			fo=new FileOutputStream("copied.png");
			fo.write(is.readAllBytes());
			r1=rs.getCharacterStream(6);
			
		}
		pw=new PrintWriter("hi.txt");
			//IOUtils.copy(r1,pw) ; to work with this download the common.jar file to the project
		fo.close();
		is.close();
		r.close();
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally {
		try {

			if(con!=null)	con.close();
			if(st!=null)	st.close();
			if(rs!=null)	rs.close();

		}
		catch(Exception w)
		{
			w.printStackTrace();
		}	}
}
}
