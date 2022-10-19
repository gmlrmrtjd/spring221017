package org.zerock.controller.lecture.p03forward;
// viewresolve 역
// void 타일때 viewresolve
// void 타입 아닐때 return값 null 일때 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex15")
public class Controller15 {
	
	// 요청경로 : /ex15/sub01
	@RequestMapping("sub01")
	public void method1() {
		System.out.println("method1");
	}
	
	// sub02 요청
	// /WEB-INF/view/ex15/sub02.jsp로 forward
	@RequestMapping("sub02")
	public void method2() {
		System.out.println("method2");
	}
	
	@RequestMapping("sub03")
	public String method3() {
		System.out.println("method3");
		// void처럼 view name을 사용해서 view로 forward
		return null; 
	}
	
	// sub04 요청
	// /WEB-INF/view/ex15/sub04.jsp로 forward
	@RequestMapping("sub04")
	public String method4() {
		System.out.println("method4");
		return null;
	}
	
	// sub05요청
	// name request param이 있으면
	// /WEB-INF/view/ex15/sub051.jsp로 forward
	// 없으면
	// /WEB-INF/views/ex15/sub05.jsp로 forward
	@RequestMapping("sub05")
	public String method5(String name) {
		if (name == null) {
			return null;
		}
		
		return "ex15/sub051";
	}
	
	// address request param 이 있으면 
	// /WEB-INF/view/ex15/sub061.jsp로 forward
	// 없으면
	// /WEB-INF/view/ex15/sub06.jsp로 forward
	@RequestMapping(path = "sub06", params = "address")
	public String method6(String name) {
		System.out.println("method6");
		return "ex15/sub061";
	}
	@RequestMapping("sub06")
	public void method7() {
		System.out.println("method7");
	}
}
