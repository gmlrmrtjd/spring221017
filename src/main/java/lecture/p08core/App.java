package lecture.p08core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lecture.p07core.Dao;

public class App {
	public static void main(String[] args) {
		String loc = "/lecture/p08core/context.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(loc);
		
		System.out.println(context.getBean(Controller.class));
		System.out.println(context.getBean(Service.class));
		System.out.println(context.getBean(Repository.class));
		
		System.out.println(context.getBean(Dao.class));
		
		System.out.println("프로그램 실행");
	}
}
