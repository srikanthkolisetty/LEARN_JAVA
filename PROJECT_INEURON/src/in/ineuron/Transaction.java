package in.ineuron;
import java.sql.*;
import java.io.*;
import java.util.*;
public class Transaction {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		Scanner sc= new Scanner(System.in);
		try
		{
			
			con=JDBCCommon.getJdbcUtilConnection();
			if(con!=null)	st=con.createStatement();
			if(st!=null)	rs=st.executeQuery("SELECT * FROM INEURON.TRAN");
			if(rs!=null)
				while(rs.next())
				{
					System.out.println(rs.getInt("id"));
					System.out.println(rs.getString("name"));
					System.out.println(rs.getString("balance"));
				}
			// now we are performing a transaction so let us first set the autocommit false
			con.setAutoCommit(false);
			int out1=st.executeUpdate("UPDATE INEURON.TRAN SET balance=balance-2000 where id =1");
			int out2=st.executeUpdate("UPDATE INEURON.TRAN SET balance=balance+2000 where id =2");
			boolean transaction_successful; //not a good practise to write like this i mean about variable name
			System.out.println("did the transaction success");
			transaction_successful=Boolean.parseBoolean(sc.next());
			if(transaction_successful)
			{
				System.out.println(out1+""+out2);
				con.commit();
			}
			else
			{
				con.rollback();
				System.out.println("the transactions are not reflected and roll backed");
			}
			
			// now rollbacking to a particular savepoint
			
			int out3=st.executeUpdate("INSERT INTO INEURON.TRAN(name,balance) VALUES('mother',600000)");
			int out4=st.executeUpdate("INSERT INTO INEURON.TRAN(name,balance) VALUES('sister',700000)");
			Savepoint sp=con.setSavepoint();
			int out5=st.executeUpdate("INSERT INTO INEURON.TRAN(name,balance) VALUES('brother',800000)");
			// now i don't want last insertion to happen then 
			con.rollback(sp);
			
			con.commit();
			System.out.println(out3+""+out4+""+out5);
			
			
			
			
		}
		catch(SQLException | IOException e)
		{
			
		}
		catch(Exception w)
		{
			w.printStackTrace();
		}
		finally
		{
			try {
				con.close();
				st.close();
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		
	}
}
