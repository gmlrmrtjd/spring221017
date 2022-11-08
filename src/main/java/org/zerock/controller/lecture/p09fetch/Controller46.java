package org.zerock.controller.lecture.p09fetch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("ex46")
public class Controller46 {

	@RequestMapping("sub")
	public void method() {
		
	}
	
	@GetMapping("sub01")
	@ResponseBody
	public String method1() throws Exception {
		
		System.out.println("db작업중... 좀 오래 걸림");
		Thread.sleep(5000);
		
		System.out.println("db작업 끝, 응답!");
		
		return "hello world!!";
	}
}







