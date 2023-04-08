package in.ineuron.test;

import org.hibernate.Session; 
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.ineuron.pack.Student;
import in.ineuron.pack.Yes;

public class DatabaseInteraction {
 public static void main(String[] args) {
	
	 Configuration c= new Configuration();
	 c.configure().addAnnotatedClass(Yes.class); // by dfault seraches for hibernate.cfg.xml
	 
	 SessionFactory sessionFactory = c.buildSessionFactory();
	 Session session = sessionFactory.openSession();
	// Student std = new Student();
	 //std.setId(27);
//	 std.setAge(23);
//	 std.setCourse("telugu");
	// std.setName("sirs");
	Yes y= new Yes();
	y.setId(12);
	y.setAddress("ss");
	y.setName("ss");
	 Transaction trans=session.beginTransaction();
		
//	session.persist(std);
	 session.persist(y);
			trans.commit();
	session.close();
	sessionFactory.close();
	
	 
	 
}
}
