package org.zerock.controller.lecture.p03forward;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex14")
public class Controller14 {
	// 1. 요청받고
	// 2. request parameter 수집
	// 3. request parameter 가공
	// 4. business logic
	// 5. add attribute
	// *6. forward / redirect
	
	@RequestMapping("sub01")
	public void method1(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		System.out.println("method1");
		String path = "/WEB-INF/views/ex15/sub01.jsp";
		req.getRequestDispatcher(path).forward(req, res);
		
	}
	
	@RequestMapping("sub02")
	public String method2() {
		System.out.println("method2");
		
		return "abc";
	}
	
	// sub03 경로
	// /WEB-INF/views/xyz.jsp 로 포워드하는 메소드 작성
	@RequestMapping("sub03")
	public String method3() {
		System.out.println("method3");
		
		return "xyz";
	}
}
