package in.ineuron.test;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.ineuron.pack.Account;

public class SqlDelete {

	public static void main(String[] args) {
		
		Configuration con = new Configuration();
		con.configure().addAnnotatedClass(Account.class);
		SessionFactory factory = con.buildSessionFactory();
		if(factory!=null)
		{
			Session openSession = factory.openSession();
			if(openSession!=null)
			{
				Transaction t=openSession.beginTransaction();
				if(t!=null)
				{
					try {
							Account n= new Account();
							n.setAccNo(456);
							openSession.delete(n);
							//openSession.flush();
							Account n1=openSession.get(Account.class, 456);
							System.out.println("k"+n1);
							t.commit();
							}
					catch(HibernateException e)
					{
						e.printStackTrace();
					}
					}
			}
		}
	

	}
}
