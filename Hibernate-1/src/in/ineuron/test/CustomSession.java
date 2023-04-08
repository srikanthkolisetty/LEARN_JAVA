package in.ineuron.test;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.ineuron.pack.Custom;

public class CustomSession {

	public static void main(String[] args) throws IOException {
		
//		Configuration c= new Configuration();
//		c.configure().addAnnotatedClass(Custom.class);
//		SessionFactory buildSessionFactory = c.buildSessionFactory();
		SessionFactory buildSessionFactory = new Configuration().configure().addAnnotatedClass(Custom.class).buildSessionFactory();
	System.in.read();
		if(buildSessionFactory != null)
		{
			Session s=buildSessionFactory.openSession();
			Transaction t= s.beginTransaction();
			if(s!=null)
			{
				Custom cu = new Custom();
				cu.setName("shiva");
				cu.setCourse("shamboo");
				String prim = (String)s.save(cu);
				t.commit();
				s.close();
			}
		}
		
	}
}
