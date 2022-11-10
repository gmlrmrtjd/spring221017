package org.zerock.service.boardEx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.boardEx.BoardExDto;
import org.zerock.mapper.boardEx.BoardExMapper;

@Service
public class BoardExService {
	
	@Autowired
	private BoardExMapper mapper;
	
	public int register(BoardExDto board) {
		return mapper.insert(board);
	}

	public List<BoardExDto> listBoard(int page) {
		int records = 10;
		int offset = (page -1) * records;
		
		return mapper.list();
	}

	public BoardExDto get(int id) {
		// TODO Auto-generated method stub
		return mapper.select(id);
	}

	public int update(BoardExDto board) {
		// TODO Auto-generated method stub
		return mapper.update(board);
	}

	public int remove(int id) {
		// TODO Auto-generated method stub
		return mapper.delete(id);
	}

}
