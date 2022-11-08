package org.zerock.controller.lecture.p09fetch;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.lecture.JavaBean20;
import org.zerock.domain.lecture.JavaBean24;
import org.zerock.domain.lecture.JavaBean25;
import org.zerock.domain.lecture.JavaBean26;
import org.zerock.domain.lecture.JavaBean27;

@Controller
@RequestMapping("ex45")
public class Controller45 {

	@RequestMapping("sub")
	public void method() {

	}

	@GetMapping("sub01")
	public ResponseEntity method01() {
//		return ResponseEntity.ok().build();
//		return ResponseEntity.badRequest().build();
//		return ResponseEntity.notFound().build();
		return ResponseEntity.status(500).build();
	}
	
	@GetMapping("sub02")
	public ResponseEntity method02() {
//		return ResponseEntity.status(202).build();
		return ResponseEntity.accepted().build();
	}
	
	@GetMapping("sub03")
	public ResponseEntity method03() {
		return ResponseEntity.ok()
				.header("My-Header", "My-Value")
				.build();
	}
	
	@GetMapping("sub04")
	public ResponseEntity method04() {
		return ResponseEntity.ok()
				.header("Your-Header", "Your-Value")
				.build();
	}
	
	@GetMapping("sub05")
	public ResponseEntity<String> method05() {
		return ResponseEntity.ok()
//				.header("Content-Type", "text/plain;charset=UTF-8")
				.body("헬로 월드");
	}
	
	@GetMapping("sub06")
	public ResponseEntity<JavaBean24> method06() {
		JavaBean24 data = new JavaBean24();
		data.setLocation("서울");
		data.setSince("2000년");
		
		return ResponseEntity.ok()
				.body(data);
	}
	
	@GetMapping("sub07")
	public ResponseEntity<JavaBean20> method07() {
		JavaBean20 data = new JavaBean20();
		data.setAddress("서울");
		data.setName("손흥민");
		
		return ResponseEntity.ok(data);
	}
	
	@GetMapping("sub08")
	public ResponseEntity<JavaBean27> method08() {
		JavaBean27 data = new JavaBean27();
		data.setName("박지성");
		data.setDate(LocalDate.now());
		data.setDateTime(LocalDateTime.now());
		
		return ResponseEntity.ok(data);
	}
	
	@GetMapping("sub09")
	public ResponseEntity<JavaBean25> method09() {
		JavaBean25 data = new JavaBean25();
		JavaBean26 sub = new JavaBean26();
		
		sub.setAddress(List.of("서울", "부산", "제주"));
		sub.setMarried(true);
		
		data.setInfo(sub);
		data.setAge(99);
		
		return ResponseEntity.ok(data);
	}
	
	@GetMapping("sub10")
	@ResponseBody
	public JavaBean25 method10() {
		JavaBean25 data = new JavaBean25();
		JavaBean26 sub = new JavaBean26();
		
		sub.setAddress(List.of("서울", "부산", "제주"));
		sub.setMarried(true);
		
		data.setInfo(sub);
		data.setAge(99);
		
		return data;
	}
	
	// sub11 요청경로 
	// JavaBean27 을 json 으로 변경한 응답하는 메소드 작성
	// @ResponseBody 사용
	@GetMapping("sub11")
	@ResponseBody
	public JavaBean27 method11() {
		JavaBean27 data = new JavaBean27();
		data.setName("박지성");
		data.setDate(LocalDate.now());
		data.setDateTime(LocalDateTime.now());
		
		return data;
	}
	
	@GetMapping("sub12")
	@ResponseBody
	public String method12() {
		return "헬로 월드";
	}
	
	@GetMapping("sub13")
	@ResponseBody
	public Map<String, String> method13() {
		Map<String, String> map = new HashMap<>();
		map.put("address", "서울");
		map.put("email", "abc@gmail.com");
		map.put("age", "33");
		
		return map;
	}
	
	@GetMapping("sub14")
	@ResponseBody
	public Map<String, Object> method14() {
		Map<String, Object> map = new HashMap<>();
		JavaBean25 data = new JavaBean25();
		JavaBean26 sub = new JavaBean26();
		
		sub.setAddress(List.of("제주", "울릉도"));
		sub.setMarried(false);
		
		data.setAge(99);
		data.setInfo(sub);
		
		map.put("address", "부산");
		map.put("age", 33);
		map.put("married", true);
		map.put("data", data);
		
		return map;
	}
	
	@GetMapping("sub15")
	@ResponseBody
	public Map<String, Object> method15() {
		Map<String, Object> map = new HashMap<>();
		map.put("car", "tesla");
		map.put("model", "avante");
		map.put("color", List.of("blue", "red"));
		
		
		return map;
	}
}











