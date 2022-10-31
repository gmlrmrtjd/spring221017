package org.zerock.controller.lecture.p99sample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.lecture.sample.CoffeeDto;
import org.zerock.mapper.lecture.sample.CoffeeMapper;

@Controller
@RequestMapping("/sample")
public class CoffeeController {
	@Autowired
	private CoffeeMapper mapper;
	
	@GetMapping("coffee")
	public void form(Model model) {
		List<CoffeeDto> list = mapper.getCoffeeList();
		
		model.addAttribute("coffeeList", list);
	}
	
	@PostMapping("coffee")
	public String updateCoffe(CoffeeDto coffee) {
		mapper.update(coffee);
		
		return "redirect:coffee";
	}
}








