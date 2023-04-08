package in.ineuron.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import in.ineuron.pack.Student;

public class HibernateThree {
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
		}
		if(t!=null)
		{
			Student stu=s.get(Student.class, 27);
			stu.setCourse("pp");
			Student stu2 = s.get(Student.class, 27);
			System.out.println("se"+stu2.getCourse());
			s.close();
			stu2.setCourse("ppp");
			System.out.println(stu.getCourse());
			// here if we do t.commit() we get an exception.
		}
 }
}
