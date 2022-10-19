package org.zerock.controller.lecture.p02param;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.lecture.JavaBean01;

@Controller
@RequestMapping("ex13")
public class Controller13 {
	
	// /ex13/sub01?name=park&address=seoul
	@RequestMapping("sub01")
	public void method1(JavaBean01 bean1) {
		System.out.println("메소드 1번 일함");
		
		System.out.println(bean1.getName());
		System.out.println(bean1.getAddress());
		System.out.println(bean1.getEmail());
	}
	
	
	
	
}










