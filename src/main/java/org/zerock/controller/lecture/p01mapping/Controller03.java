package org.zerock.controller.lecture.p01mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex03")
public class Controller03 {
	
	// /ex03/sub01
	// /ex03/sub02
	@RequestMapping({"sub01", "sub02"})
	public void method01() {
		System.out.println("ex03 method1");
	}
	
	// /ex03/sub04
	// /ex03/sub05
	@RequestMapping({"sub04", "sub05"})
	public void method02() {
		System.out.println("ex03 method2");
	}
	
//	@RequestMapping("sub06")
	@RequestMapping(value = "sub06")
	public void method03() {
		System.out.println("ex03 method3");
	}
	
	@RequestMapping(path = "sub07")
	public void method04() {
		System.out.println("ex03 method4");
	}
}
