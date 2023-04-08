package in.ineuron.test;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.ineuron.pack.Versionn;

public class VersionnCount2 {
 public static void main(String[] args) throws IOException, InterruptedException {
	
		SessionFactory buildSessionFactory = new Configuration().configure().addAnnotatedClass(Versionn.class).buildSessionFactory();
		if(buildSessionFactory != null)
		{
			Session s=buildSessionFactory.openSession();
			Transaction t= s.beginTransaction();
			if(s!=null)
			{
			Versionn ve=s.get(Versionn.class, 0);
			Thread.sleep(30000);
			//System.in.read();
	//		s.refresh(ve);
			ve.setCount(9);
			System.out.println("after read");
			t.commit();
			s.close();
		}

}
 }
}
