package in.ineuron.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.ineuron.pack.Lob;

public class LobCom {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		SessionFactory buildSessionFactory = new Configuration().configure().addAnnotatedClass(Lob.class).buildSessionFactory();
		if(buildSessionFactory !=null)
		{
			Session openSession = buildSessionFactory.openSession();
			Transaction beginTransaction = openSession.beginTransaction();
				Lob l= new Lob();
				l.setId(1);
				l.setImg(new FileInputStream("C:\\Users\\admin\\Pictures\\Screenshots\\Screenshot (221).png").readAllBytes());
				int len=(int)new File("D:\\history.pdf").length();
				char[] c= new char[len];
				new FileReader("D:\\history.pdf").read(c);
			//	l.setText(c);
				openSession.save(l);
				beginTransaction.commit();
				openSession.close();
		}
	
	}
}
