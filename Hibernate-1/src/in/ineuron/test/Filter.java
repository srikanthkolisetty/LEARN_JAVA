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

public class Filter {

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
						
						
						org.hibernate.Filter filter = openSession.enableFilter("Acc_Filter");
						filter.setParameter("accType1","closed");
						filter.setParameter("accType2","blocked");
						Query q= openSession.createQuery("From in.ineuron.pack.Account");
						List<Account> li=q.getResultList();
						li.forEach(System.out::println);
						
						Query r=openSession.createQuery("delete from in.ineuron.pack.Account");
						System.out.println(r.executeUpdate());
						@SuppressWarnings("deprecation")
						Criteria c= openSession.createCriteria(Account.class);
						System.out.println(c.list().size());
						openSession.disableFilter("Acc_Filter");
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
