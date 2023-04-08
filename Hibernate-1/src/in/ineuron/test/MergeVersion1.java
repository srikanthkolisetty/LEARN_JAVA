package in.ineuron.test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.ineuron.pack.Versionn;

public class MergeVersion1 {

	 public static void main(String[] args) {
		
			SessionFactory buildSessionFactory = new Configuration().configure().addAnnotatedClass(Versionn.class).buildSessionFactory();
			Session s= buildSessionFactory.openSession();
			Transaction t= s.beginTransaction();
			Versionn v = new Versionn();
			v.setId(32);
			v.setCre(LocalDate.of(2023, 03, 18));
			v.setUpd(LocalDateTime.of(2023, 06, 18, 9,42));
			s.merge(v);
			s.flush();
		//	t.commit();
			s.close();
		
				
	}
}
