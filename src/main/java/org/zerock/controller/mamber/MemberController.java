package org.zerock.controller.mamber;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.member.MemberDto;

@Controller
@RequestMapping("member")
public class MemberController {
	
	@GetMapping("signup")
	public void signup() {
		
	}
	
	@PostMapping("signup")
	public void signup(MemberDto member) {
		System.out.println(member);
	}
	

}
