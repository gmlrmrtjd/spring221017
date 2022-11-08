package org.zerock.controller.lecture.p09fetch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex39")
public class Controller39 {

	
	@RequestMapping("sub01")
	public void method1() {
		
	}
	
	@RequestMapping("sub02")
	public void method2() {
		System.out.println("/ex39/sub02 요청 잘 받음");
	}
	
	@RequestMapping("sub03")
	public void method3() {
		System.out.println("/ex39/sub03 요청 잘 받음");
	}
}
