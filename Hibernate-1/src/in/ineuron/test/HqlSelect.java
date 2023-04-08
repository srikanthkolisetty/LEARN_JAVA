package in.ineuron.test;

import java.util.List; 
import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import in.ineuron.pack.Student;

public class HqlSelect {
	public static void main(String[] args) {

		SessionFactory buildSessionFactory = new Configuration().configure().buildSessionFactory();
		if (buildSessionFactory != null) {
			Session openSession = buildSessionFactory.openSession();
			if (openSession != null) {
					Query<Student> query = openSession.createQuery("From in.ineuron.pack.Student where course=:par");
					query.setParameter("par", "op");

					List<Student> stud = query.list();

					stud.forEach(System.out::print);
					List<Student> stud2 = query.getResultList();
					System.out.println(stud2);
					// for partial loading
					Query<Object[]> obj = openSession
							.createQuery("select course,age from in.ineuron.pack.Student where course= :par");

					obj.setParameter("par", "op");

					List<Object[]> ob = obj.getResultList();
					ob.forEach(row -> {
						System.out.println(row[0]);
					});

					System.out.println(ob.isEmpty());
					Query qu = openSession.createQuery("select course from in.ineuron.pack.Student where id=1");
					Object cour = qu.uniqueResult();
					System.out.println((String) cour);
					Query q = openSession.createQuery("From in.ineuron.pack.Student where id=1");
						q.setCacheable(true);
					Student std = (Student) q.uniqueResult();
					System.out.println(std);
					Query qt = openSession.createQuery("From in.ineuron.pack.Student where id=1");
					Optional<Student> op = qt.uniqueResultOptional();
					if (op.isPresent()) {
							System.out.println(op.get());
					}
					else
					{
						System.out.println("record not found");
					}
					System.out.println("hi"+q.uniqueResult());
					Query que=openSession.getNamedQuery("hql");
					List<Student> l = que.getResultList();
					System.out.println(l.size());
				}
			}
		}
	}

