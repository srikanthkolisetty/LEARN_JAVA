package in.ineuron.test;

import java.util.HashMap;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import in.ineuron.pack.Student;

public class CriteriaApi {
	public static void main(String[] args) {

		Configuration con = new Configuration().configure();
		SessionFactory buildSessionFactory = con.buildSessionFactory();
		if (buildSessionFactory != null) {
			Session session = buildSessionFactory.openSession();

			if (session != null) {
				Transaction t = session.beginTransaction();
				if (t != null) {
					
					
					Criteria a = session.createCriteria(Student.class);
					HashMap<String,String> ae = new HashMap();
					//ae.put("course","telugu");
				//	System.out.println(a.list());
					//Criterion c= Restrictions.allEq(ae);
					//a.add(c);
					System.out.println("after");
					Order r=Order.desc("id");
					a.addOrder(r);
					System.out.println(a.list());
					Criterion e= Restrictions.or(Restrictions.ne("course","telugu"), Restrictions.isNotNull("age"));
					a.add(e);
					ProjectionList list=Projections.projectionList();
					list.add(Projections.property("id"));
					list.add(Projections.property("course"));
					list.add(Projections.property("age"));
					a.setProjection(list);
//					Object ab=a.list().get(0);
//					System.out.println(ab[0]);
		//			List<Object[]> d= a.list();
					Object[]aej =(Object[]) a.list().get(0);
					System.out.println("ddddddddddd"+aej[0]);
				//	System.out.println(d);
//					d.forEach(row->{
//						for(Object or:row)
//						{
//							System.out.println("in"+or);
//						}
//					});
//					//System.out.println((Student)ab);
				}
			}
		}
	}
}
