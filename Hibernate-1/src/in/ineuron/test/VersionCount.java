package in.ineuron.test;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.ineuron.pack.Custom;
import in.ineuron.pack.Project;
import in.ineuron.pack.Versionn;

public class VersionCount {

	public static void main(String[] args) throws IOException {
		
		
		SessionFactory buildSessionFactory = new Configuration().configure().addAnnotatedClass(Versionn.class).buildSessionFactory();
		if(buildSessionFactory != null)
		{
			Session s=buildSessionFactory.openSession();
			Transaction t= s.beginTransaction();
//			if(s!=null)
//			{
//				Versionn v= new Versionn();
//				v.setCre(LocalDate.of(2023, 03, 18));
//				v.setUpd(LocalDateTime.of(2023, 03, 18, 9,42));
//				s.save(v);
//				t.commit();
//				s.close();
//			}
			Versionn ve=s.get(Versionn.class, 0);
			//ve.setCre(LocalDate.of(2023, 9, 23));
	//		System.in.read();
			s.refresh(ve);
			t.commit();
			System.out.println(s.contains(ve));
			s.clear();
			System.out.println(s.contains(ve));
			s.close();
			System.out.println(ve.getCount());
			Versionn ve3= new Versionn();
			ve3.setCre(LocalDate.of(2023, 03, 18));
			ve3.setUpd(LocalDateTime.of(2023, 06, 18, 9,42));
			ve3.setCount(6);
			Session se5= buildSessionFactory.openSession();
			Versionn ve2 =se5.get(Versionn.class, 0);
			 se5.merge(ve3);
			 System.out.println("after save");
		}

	}
}
