package in.ineuron.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.type.StandardBasicTypes;

import in.ineuron.pack.Student;

public class NativeSql {
		
		public static void main(String[] args) {
			
			Configuration con= new Configuration().configure();
			SessionFactory buildSessionFactory = con.buildSessionFactory();
			if(buildSessionFactory!=null)
			{
				Session session = buildSessionFactory.openSession();
				
				if(session!=null)
				{
					Transaction t = session.beginTransaction();
					if(t!=null)
					{
						NativeQuery<Student> ntq=session.createSQLQuery("select * from studentj");
						ntq.addEntity(Student.class);
						List<Student> stList=ntq.getResultList();
							stList.forEach(System.out::println);
							NativeQuery nt = session.createSQLQuery("select course from studentj where id=?");
								nt.setParameter(1, 101);
								System.out.println(nt.uniqueResult());
							NativeQuery<Object[]> nth = session.createSQLQuery("Select name,course from studentj where id=:id");
						//	nth.addScalar("name", StandardBasicTypes.STRING);
							//nth.addScalar("course", StandardBasicTypes.STRING);
							nth.setParameter("id", 1);
							System.out.println(nth.getResultList().get(0)[0]);
					// addScalar is optional but goodPractise
							NativeQuery query = session.createSQLQuery("insert into studentj(id,name,age,course) values(343,?,?,?)");
							query.setParameter(1, "sri");
							query.setParameter(2, 23);
							query.setParameter(3, "java");
							System.out.println(query.executeUpdate());
							NativeQuery<Student> g= session.getNamedNativeQuery("hello");
							g.addEntity(Student.class);
							System.out.println(g.list());
							
					}
				}
			}
			
			
		}
}
