package in.ineuron.test;

import javax.persistence.LockModeType;

import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import in.ineuron.pack.Student;

public class HibernateFour {

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
			Student stu=s.get(Student.class, 27,LockMode.UPGRADE_NOWAIT
					);
			Student g = new Student();
			g.setId(27);
			g.setCourse("op");
			//s.evict(stu);
			stu.setAge(93);
			//s.update(stu);
			//System.out.println(stu.getCourse());
			t.commit();
			
		}
	}
}
