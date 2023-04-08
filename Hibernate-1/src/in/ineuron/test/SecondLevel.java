package in.ineuron.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import in.ineuron.pack.Student;

public class SecondLevel {

	public static void main(String[] args) {
		
		SessionFactory sessionfactory =null;
		Session s=null;
		Transaction t=null;
		sessionfactory=HibernateUtil.getSessionFactory();
		if(sessionfactory != null)
		{
			s=HibernateUtil.getSession(sessionfactory);
		}
		if(s!=null)
		{
			t=s.beginTransaction();
			Student stu = s.get(Student.class, 27);
			s.evict(stu);
			System.out.println(s.contains(stu));
			System.out.println(s.get(Student.class, 27)); // this should come from second level cache.
		}
	
	}
}
