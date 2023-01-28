package in.ineuron;
import java.sql.*;
import java.io.*;
import java.util.*;

public class ProjectJdbc {
public static void main(String[] args) throws SQLException,IOException {

	Connection con=JDBCCommon.getJdbcUtilConnection();
	int option;
	System.out.println("Press 1 for insert operation");
	System.out.println("Press 2 for select operation");
	System.out.println("Press 3 for update operation");
	System.out.println("Press 4 for delete operation");
	System.out.println("Press 5 for exit");
	Scanner sc= new Scanner(System.in);
	option=Integer.parseInt(sc.nextLine());

	
	switch(option)
	{
	case 1:
		System.out.println("please enter the name");
		String name=sc.nextLine();
		int salary=Integer.parseInt(sc.nextLine());
		int age=Integer.parseInt(sc.nextLine());
		PreparedStatement st1=con.prepareStatement("INSERT INTO INEURON.EMPLOYEE(NAME,SALARY,AGE) VALUES(?,?,?)");
		st1.setString(1, name);
		st1.setInt(2,salary);
		st1.setInt(3, age);
		int count=st1.executeUpdate();
		if(count>0)	System.out.println("record inserted successfully");
		else	System.out.println("insertion of record failed");
		break;
	case 2:
		System.out.println("The details present in the db are... ");
		PreparedStatement st2=con.prepareStatement("SELECT * FROM INEURON.EMPLOYEE");
		ResultSet rs=st2.executeQuery();
		if(rs!=null)
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getInt(4));
		}
		else	System.out.println("no details fetched");
		rs.close();
		break;
	case 3:
		System.out.println("enter the id of the employee");
		int id=Integer.parseInt(sc.nextLine());
		PreparedStatement st3=con.prepareStatement("Select * from INEURON>EMPLOYEE where id=?");
		st3.setInt(1, id);
		rs=st3.executeQuery();
		if(rs!=null)
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getInt(4));
		}
		else	System.out.println("no details fetched");
		rs.close();
		System.out.println("enter the new name");
		name=sc.nextLine();
		System.out.println("enter the new salary");
		salary=Integer.parseInt(sc.nextLine());
		System.out.println("enter the new age");
		age=Integer.parseInt(sc.nextLine());
		PreparedStatement st4=con.prepareStatement("UPDATE INEURON.EMPLOYEE SET NAME=?,SALARY=?,AGE=? WHERE ID=?");
		st4.setString(1,name);
		st4.setInt(2, salary);
		st4.setInt(3, age);
		count=st4.executeUpdate();
		if(count>0)	System.out.println("row updated successfully");
		else	System.out.println("no row gets updated");
		break;
	case 4:
		System.out.println("enter the id that you want to delete");
		id=Integer.parseInt(sc.nextLine());
		PreparedStatement st5=con.prepareStatement("DELETE FROM INEURON.EMPLOYEE WHERE ID=?");
		st5.setInt(1, id);
		count =st5.executeUpdate();
		if(count>0)	System.out.println("row deleted successfully");
		else System.out.println("no row deleted");
		break;
	default:
		System.out.println("invalid option selected");
		break;
	}
	
}
}
