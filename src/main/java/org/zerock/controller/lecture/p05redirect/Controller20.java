package org.zerock.controller.lecture.p05redirect;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex20")
public class Controller20 {
	// redirect 때 데이터 넘겨주는 방법
	
	// 쿼리스트링으로 붙여서 넘겨주기
	@RequestMapping("sub01")
	public String method1() {
		return "redirect:/ex20/sub02?name=donald";
	}
	
	@RequestMapping("sub02")
	public String method2(String name) {
		System.out.println("리다이렉트 잘됨 sub02!!!!");
		System.out.println(name);
		return null;
	}
	
	// sub03 요청
	// /ex20/sub04 로 redirect
	// 쿼리스트링에 request parameter : address=seoul&age=30
	@RequestMapping("sub03")
	public String method3() {
		return "redirect:/ex20/sub04?address=seoul&age=30";
	}
	@RequestMapping("sub04")
	public String method3(String address, Integer age) {
		System.out.println("리다이렉트 sum03");
		System.out.println(address);
		System.out.println(age);
		return null;
	}
}

