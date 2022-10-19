package org.zerock.controller.lecture.p01mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("ex005")
public class Controller005 {
	
	@RequestMapping(value = "sub01", method = RequestMethod.GET)
	public void method1() {
		System.out.println("method1");
	}
	
//	@GetMapping("sub02")
//	public void method2() {
//		System.out.println("method2");
//	}
	
	@RequestMapping("sub03")
	public void method3() {
		System.out.println("method2");
	}
}
