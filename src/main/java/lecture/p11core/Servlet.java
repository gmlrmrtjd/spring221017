package lecture.p11core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Servlet {
	
	private Dao dao;
	
	public Servlet() {
		
	}
	
//	@Autowired
	public Servlet(Dao dao) {
		this.dao = dao;
	}
	
	public Dao getDao() {
		return dao;
	}
}





