package in.ineuron.test;

import org.hibernate.query.*;

import in.ineuron.pack.Yes;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HqlNonSelect {
	public static void main(String[] args) {
		SessionFactory buildSessionFactory = new Configuration().configure().addAnnotatedClass(Yes.class).buildSessionFactory();
		if (buildSessionFactory != null) {
			Session openSession = buildSessionFactory.openSession();
			
			if(openSession !=null)
			{
				Transaction t= openSession.beginTransaction();
				if(t!=null)
				{
				//	Query qu=openSession.createQuery("update in.ineuron.pack.Student set age=:agee where id=1");
				//	qu.setParameter("agee", 10);
					//int rowsAffected = qu.executeUpdate();
				//	System.out.println(rowsAffected);
				try {
//					Query qu2=openSession.createQuery("delete from in.ineuron.pack.Student  where id=2");
//					int rowsAffected2 = qu2.executeUpdate();
			//		System.out.println(rowsAffected2);
					Query qu3 = openSession.createQuery("insert into in.ineuron.pack.Student(id,name) select y.id,y.name from  in.ineuron.pack.Yes as y where y.id=101");
						
					System.out.println(qu3.executeUpdate());
						t.commit();
						openSession.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
					System.out.println("kk");
					t.rollback();
				}
					
				}
			}
			}
		}

		
		
	}

