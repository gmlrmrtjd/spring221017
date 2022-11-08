package org.zerock.mapper.board;

import java.util.List;

import org.zerock.domain.board.BoardDto;

public interface BoardMapper { 

	int insert(BoardDto board);  // xml에 insert 요소(id) 있어야함.
	
	List<BoardDto> list(int offset, int records, String type, String keyword);  // resultType에 이름 복붙 
	
	BoardDto select(int id);
	
	int update(BoardDto board);
	
	int delete(int id);
	
	int countAll(String type, String keyword);
}


