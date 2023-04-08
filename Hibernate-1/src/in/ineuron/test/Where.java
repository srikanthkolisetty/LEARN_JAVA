package in.ineuron.test;

import org.hibernate.query.Query;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.ineuron.pack.Account;

public class Where {
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

						Query<Account> c = openSession.createQuery("From in.ineuron.pack.Account");
						c.list();
						Query<Account> c2=openSession.createSQLQuery("select * from Accounts");
						c2.getResultList();
						
						Criteria c3=openSession.createCriteria(Account.class);
						System.out.println("last");
						c3.list();
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
