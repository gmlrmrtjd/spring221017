package org.zerock.controller.lecture.p07mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.mapper.lecture.Mapper01;

@Controller
@RequestMapping("ex28")
public class Controller28 {

	@Autowired
	private Mapper01 mapper;
	
	@RequestMapping("sub01")
	public void method1() {
		String time = mapper.getCurrentTime();
		System.out.println(time);
	}
	@RequestMapping("sub02")
	public void method2() {
		System.out.println(mapper.getCustomerName());
	}
	
	@RequestMapping("sub03")
	public void method3() {
		System.out.println(mapper.getEmployeeName());
	}
	
	@RequestMapping("sub04")
	public void method4() {
		System.out.println(mapper.getProductName());
	}
	
	@RequestMapping("sub05")
	public void method5() {
		System.out.println(mapper.getPrice());
	}
	
	@RequestMapping("sub06")
	public void method6() {
		System.out.println(mapper.getQuantity());
	}
	
	@RequestMapping("sub07")
	public void method7() {
		System.out.println(mapper.getBirthDate());
	}
}
