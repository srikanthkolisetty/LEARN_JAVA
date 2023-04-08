package in.ineuron.test;

import javax.persistence.Query;
import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HqlInsert {
	public static void main(String[] args) {
		
		Configuration con = new Configuration().configure();
		SessionFactory d= con.buildSessionFactory();
		Session s= d.openSession();
		Transaction t= s.beginTransaction();
		Query q=s.createQuery("insert into in.ineuron.pack.Yes(id,name) values(:id,:name)");
		q.setParameter("id", 100);
		q.setParameter("name","shivaparva");
		System.out.println(q.executeUpdate());
		t.commit();
		
		
		
	}

}
