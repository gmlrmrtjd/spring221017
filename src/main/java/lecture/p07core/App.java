package lecture.p07core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		String loc = "/lecture/p07core/context.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(loc);
		
		Service s = context.getBean(Service.class);
		Dao d = context.getBean(Dao.class);
		
		System.out.println(s);
		System.out.println(d);
		
		System.out.println("프로그램 실행 계속됨");
	}
}





