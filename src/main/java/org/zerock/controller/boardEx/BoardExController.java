package org.zerock.controller.boardEx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
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
	public String register(BoardExDto board, RedirectAttributes rttr) {
		System.out.println(board);
		
		int cnt = service.register(board);
		
		if (cnt == 1) {
			rttr.addFlashAttribute("message", "새 게시물이 등록되었습니다.");
		} else {
			rttr.addFlashAttribute("message", "새 게시물이 등록되지 않았습니다.");
		}
		
		// /boardEx/list로 redirect
		return "redirect:/boardEx/list";
	}
	
	@GetMapping("list")
	public void list(Model model) {
		// request param
		// business logic
		List<BoardExDto> list = service.listBoard();
		// add attribute
		model.addAttribute("boardList", list);
		// forward
	}
	
	@GetMapping("get")
	public void get(
			// @RequestParam(name = "id") 생략 가
			int id, Model model) {
		// business logic (게시물 db에서 가져오기)
		BoardExDto board = service.get(id);
		// add attribute  
		model.addAttribute("board", board);
		// forward 
	}
	
	@GetMapping("modify")
	public void modify(int id, Model model) {
		BoardExDto board = service.get(id);
		model.addAttribute("board", board);
	}
	
	@PostMapping("modify")
	public String modify(BoardExDto board, RedirectAttributes rttr) {
		int cnt = service.update(board);
		
		if(cnt == 1) {
			rttr.addFlashAttribute("message", board.getId() + "번 게시물이 수정되었습니다.");
		} else {
			rttr.addFlashAttribute("message", board.getId() + "번 게시물이 수정되지 않았습니다.");
		}
		
		return "redirect:/boardEx/list";
	}
	
	@PostMapping("remove")
	public String remove(int id, RedirectAttributes rttr) {
		int cnt = service.remove(id);
		
		if(cnt == 1) {
			rttr.addFlashAttribute("message", id + "번 게시물이 삭제되습니다.");
		} else {
			rttr.addFlashAttribute("message", id + "번 게시물이 삭제되지 않았습니다.");
		}
		
		return "redirect:/boardEx/list";
	}
}
