package org.zerock.controller.lecture.p09fetch;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.lecture.JavaBean18;
import org.zerock.domain.lecture.JavaBean19;
import org.zerock.mapper.lecture.Mapper11;

@Controller
@RequestMapping("ex48")
public class Controller48 {

	@Autowired
	private Mapper11 mapper;

	@GetMapping("sub")
	public void method() {
		
	}
	
	@GetMapping("sub01")
	@ResponseBody
	public List<JavaBean18> method01() {
		List<JavaBean18> customers = mapper.getCustomers();
		
		return customers;
	}
	
	@GetMapping("sub02")
	@ResponseBody
	public List<JavaBean19> method02() {
		return mapper.getSuppliers();
	}
}
