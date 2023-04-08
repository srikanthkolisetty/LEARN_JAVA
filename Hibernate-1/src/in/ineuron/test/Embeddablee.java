package in.ineuron.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.ineuron.pack.Id;
import in.ineuron.pack.Project;

public class Embeddablee {
 
	public static void main(String[] args) {
		
		Configuration con = new Configuration();
		con.configure();
		SessionFactory buildSessionFactory = con.buildSessionFactory();
		Session se = buildSessionFactory.openSession();
		Transaction t= se.beginTransaction();
		
		Project p = new Project();
		p.setIds(new Id());
		p.setPname("shiva");
		p.setPrjname("project");
		se.save(p);
		t.commit();
		se.close();
	}
}
