package lecture.p13core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean
	public Controller controller() {
		return new Controller(dao());
	}
	
	@Bean
	public Servlet servlet() {
		Servlet s = new Servlet();
		s.setDao(dao());
		return s;
	}
	
	@Bean
	public Dao dao() {
		return new Dao();
	}
}
