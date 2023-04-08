package in.ineuron.test;

import javax.persistence.ParameterMode;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.procedure.ProcedureCall;

public class StoredProcedure {
	public static void main(String[] args) {
		Configuration con = new Configuration().configure();
		SessionFactory buildSessionFactory = con.buildSessionFactory();
		if (buildSessionFactory != null) {
			Session session = buildSessionFactory.openSession();

			if (session != null) {
				Transaction t = session.beginTransaction();
				if (t != null) {
					
					ProcedureCall pdc = session.createStoredProcedureCall("sto");
					pdc.registerParameter(1,Integer.class, ParameterMode.INOUT).bindValue(27);
					System.out.println(pdc.getOutputParameterValue(1));
					
					ProcedureCall p= session.createStoredProcedureCall("fetch2");
					System.out.println(p.getResultList());
					ProcedureCall p2=session.getNamedProcedureCall("stode");
					System.out.println("hi");
					System.out.println(p2.getResultList());
					
				}
			}
		}
	}
}