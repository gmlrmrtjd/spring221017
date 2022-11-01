package org.zerock.controller.boardEx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.boardEx.BoardExDto;
import org.zerock.service.boardEx.BoardExService;

@Controller
@RequestMapping("boardEx")
public class BoardExController {

	@Autowired
	private BoardExService service;
	
	@GetMapping("register")
	public void register() {
		// 게시물 작성 view로 forward
		// /WEB-INF/views/board/register.jsp
	}
	
	@PostMapping("register")
	public void register(BoardExDto board) {
		System.out.println(board);
		
		service.register(board);
	}
}
