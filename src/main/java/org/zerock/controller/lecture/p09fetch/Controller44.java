package org.zerock.controller.lecture.p09fetch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.lecture.JavaBean20;
import org.zerock.domain.lecture.JavaBean21;
import org.zerock.domain.lecture.JavaBean22;
import org.zerock.domain.lecture.JavaBean23;
import org.zerock.domain.lecture.JavaBean25;
import org.zerock.domain.lecture.JavaBean27;

@Controller
@RequestMapping("ex44")
public class Controller44 {
	
	@RequestMapping("sub")
	public void method() {
		
	}
	
	@PostMapping("sub01")
	public void method01(String name, String address) {
		System.out.println("1번 메소드 일함");
		System.out.println(name);
		System.out.println(address);
	}
	
	@PostMapping("sub02")
	public void method02(@RequestBody String data) {
		System.out.println("2번 메소드 일함");
		System.out.println(data);
	}
	
	@PostMapping("sub03")
	public void method03(@RequestBody JavaBean20 data) {
		System.out.println("3번 메소드 일함");
		System.out.println(data);
	}
	
	@PostMapping("sub04")
	public void method04(@RequestBody JavaBean21 data) {
		System.out.println(data);
	}
	
	@PostMapping("sub05")
	public void method05(@RequestBody JavaBean22 data) {
		System.out.println(data);
	}
	
	@PostMapping("sub06")
	public void method06(@RequestBody JavaBean23 data) {
		System.out.println(data);
	}
	@PostMapping("sub07")
	public void method07(@RequestBody JavaBean25 data) {
		System.out.println(data);
	}
	
	@PostMapping("sub14")
	public void method14(@RequestBody JavaBean27 data) {
		System.out.println(data);
	}
	
	@GetMapping("sub15/{id}")
	public void method15(@PathVariable("id") String id) {
		System.out.println(id);
	}
	
	// path variable 자동 형변환
	// 파라미터명과 path variable 이름 같으면 value 속성 생략 가능
	@GetMapping("sub16/{d}")
	public void method16(@PathVariable int d) {
		System.out.println(d); // 99
	}
}











