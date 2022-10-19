package lecture.p04core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		String config = "/lecture/p04core/context.xml";
		
		ApplicationContext context = new ClassPathXmlApplicationContext(config);
		
		Servlet s = context.getBean(Servlet.class);
		Dao d = context.getBean(Dao.class);
		
		System.out.println(s); //null이 아니어야함 
		System.out.println(d); ///null이 아니어야함 
		
		System.out.println(s.getDao());
		
		System.out.println("프로그램 계속 실행"); // exception 없이 여기까지 실행 
	}
}
