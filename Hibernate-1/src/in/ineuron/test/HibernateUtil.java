package in.ineuron.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	static public SessionFactory getSessionFactory()
	{
		Configuration con = new Configuration();
		con.configure();
		return con.buildSessionFactory();
	}
	static public Session getSession(SessionFactory fact)
	{
		return fact.openSession();
	}
}
