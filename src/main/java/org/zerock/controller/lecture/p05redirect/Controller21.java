package org.zerock.controller.lecture.p05redirect;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("ex21")
public class Controller21 {
	
	// redirect 때 데이터 넘겨주기
	
	// RedirectAttributes 사용
	// /ex21/sub01?name=captain&address=seoul
	@RequestMapping("sub01")
	public String method1(RedirectAttributes rttr) {
		rttr.addAttribute("name", "captain");
		rttr.addAttribute("address", "seoul");
		
		return "redirect:/ex21/sub02";
	}
	
	@RequestMapping("sub02")
	public void method2(String name, String address) {
		System.out.println(name);
		System.out.println(address);
	}
	
	// sub03요청
	@RequestMapping("sub03")
	public String method3(RedirectAttributes rttr) {
		rttr.addAttribute("age", 99);
		rttr.addAttribute("email", "abc@daum.net");
		return "redirect:/ex21/sub04";
	}
	@RequestMapping("sub04")
	public void method4(Integer age, String email) {
		System.out.println(age);
		System.out.println(email);
	}
}
