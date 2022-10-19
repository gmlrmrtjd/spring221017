package lecture.p09core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		String loc = "/lecture/p09core/context.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(loc);
		
		Servlet s = context.getBean(Servlet.class);
		Dao d = context.getBean(Dao.class);
		
		System.out.println(s);
		System.out.println(d);
		System.out.println(s.getDao()); // null
		
		System.out.println("프로그램 계속 실행");
	}
}
