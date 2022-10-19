package org.zerock.controller.lecture.p01mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("ex04")
public class Controller04 {
	
	@RequestMapping("sub01")
	public void method1() {
		System.out.println("메소드01");
	}
	
	// Get 방식으로 불러오기 
	@RequestMapping(value = "sub02", method = RequestMethod.GET)
	public void method2() {
		System.out.println("메소드02");
	}
	
	@RequestMapping(value = "sub03", method = RequestMethod.POST)
	public void method3() {
		System.out.println("메소드03");
	}
	
	@RequestMapping(
			value = "sub03",
			method = {RequestMethod.GET, RequestMethod.POST})
	public void method04() {
		System.out.println("메소드04");
	}
			
}
