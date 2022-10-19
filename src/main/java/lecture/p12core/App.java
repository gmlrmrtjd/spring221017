package lecture.p12core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		String loc = "/lecture/p12core/context.xml";
		
		ApplicationContext context = new ClassPathXmlApplicationContext(loc);
		
		Servlet s = context.getBean(Servlet.class);
		Dao d = context.getBean(Dao.class);
		System.out.println(s);
		System.out.println(d);
		System.out.println(s.getDao());
		
		System.out.println("프로그램 실행 계속");
		
		System.out.println("연습");
		Controller c = context.getBean(Controller.class);
		Service ser = context.getBean(Service.class);
		System.out.println(c);
		System.out.println(ser);
		System.out.println(c.getService());
	}

}









