package org.zerock.controller.lecture.p04attribute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.lecture.JavaBean01;
import org.zerock.domain.lecture.JavaBean02;

@Controller
@RequestMapping("ex18")
public class Controller18 {

	// /ex18/sub01?name=park&address=seoul&email=abc@daum.net
	@RequestMapping("sub01")
	public void method01(@ModelAttribute("bean") JavaBean01 b) {
		
	}
	
	// @ModelAttribute annotation 사용
	// bean2 라는 이름의 attribute를 model에 추가
	// bean2의 type : org.zerock.domain.lecture.JavaBean02
	@RequestMapping("sub02")
	public void method02(@ModelAttribute("bean2") JavaBean02 b) {
		b.setAge(30);
		b.setEmail("ab@daum.net");
		b.setName("a");
		b.setPassword("aaa");
	}
	
	// @ModelAttribute("student") Student b) 처럼 
	// 동일한 이름이면 생략 가능 
	@RequestMapping("sub03")
	public void method03(@ModelAttribute Student b) { 
		b.setName("son");
		b.setClassName("soccer");
		b.setStudentNumber("13");
	}
	
	// String같은 기본타입일 경우 @ModelAttribute 생략 가능 
	@RequestMapping("sub04")
	public String method04(Student b) {
		b.setName("cha");
		b.setClassName("soccer");
		b.setStudentNumber("7");
		
		return "ex18/sub03";
	}
}






