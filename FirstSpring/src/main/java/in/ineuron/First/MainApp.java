package in.ineuron.First;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
public static void main(String[] args) {
	ApplicationContext app= new ClassPathXmlApplicationContext("beans.xml");
	((SpringLove)app.getBean("First")).iamMethod();
	((Father)app.getBean("Second")).iamMethod();
}
}
