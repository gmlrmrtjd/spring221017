package org.zerock.controller.lecture.p04attribute;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex16")
public class Controller16 {
	// 1. 요청받고
	// 2. request parameter 수집
	// 3. request parameter 가공
	// 4. business logic
	// *5. add attribute
	// 6. forward / redirect

	// /ex16/sub01
	// /WEB-INF/views/ex16/sub01.jsp forward
	@RequestMapping("sub01")
	public void method1(HttpServletRequest req) {
		req.setAttribute("myName", "park ji sung");
	}
	
	// /ex16/sub02
	// add attribute : address : seoul
	@RequestMapping("sub02")
	public void method2(HttpServletRequest req) {
		req.setAttribute("address", "seoul");
	}
}


