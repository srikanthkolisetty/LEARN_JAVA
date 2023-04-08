package in.ineuron.test;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import in.ineuron.pack.Student;
import in.ineuron.pack.Student2;

public class HibernateSecond {

	public static void main(String[] args) throws IOException {
		
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
			//Student stud=s.get(Student.class,27);
			Student stud  = s.load(Student.class, 27);
			System.out.println(stud);
			stud.setCourse("ph");
			System.in.read();
			System.out.println("hi");
			Student stud1  = s.load(Student.class, 27);
			System.in.read();
		//	s.refresh(stud1);
			System.out.println("hi2");
			System.out.println(stud1.getCourse());
			Student f= new Student();
			f.setId(21);
			f.setAge(34);
		//	s.update(f);
			s.saveOrUpdate(f);
			s.delete(f);
			t.commit();
		}// here we don't need transaction management but we used only for non select transaction should be used
		
		s.clear();
		s.close();
		sessionfactory.close();
	}

}
