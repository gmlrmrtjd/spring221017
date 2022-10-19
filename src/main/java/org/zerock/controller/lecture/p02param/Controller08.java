package org.zerock.controller.lecture.p02param;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex08")
public class Controller08 {
	// 1. 요청받고
	// *2. request parameter 수집
	// *3. request parameter 가공
	// 4. business logic
	// 5. add attribute
	// 6. forward / redirect
	
	// 참고 reference
	// https://docs.spring.io/spring-framework/docs/current/reference/html/web.html#mvc-ann-arguments
	
	// /ex08/sub01
	@GetMapping("sub01")
	public void method1() {
		System.out.println("method1 !@#$!#$!$#!$@");
	}
	
	@GetMapping("sub02")
	public void method2(HttpServletRequest request) {
		System.out.println("두번째 메소드@@");
		
		String name = request.getParameter("name");
		String age= request.getParameter("age");
		System.out.println(name);
		System.out.println(age);
	}
	
	// sub03 경로
	// get 방식
	// HttpServletRequest argument을 갖는 메소드 작성
	
	// address 파라미터 (쿼리스트링)
	// get parameter (address) 꺼내서 출력 코드 작성
	@GetMapping("sub03")
	public void method3(HttpServletRequest req) {
		String address = req.getParameter("address");
		System.out.println("address : " + address);
	}
	
	
}













