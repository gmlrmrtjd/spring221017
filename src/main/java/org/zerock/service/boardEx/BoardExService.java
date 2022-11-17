package org.zerock.service.boardEx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.boardEx.BoardExDto;
import org.zerock.domain.boardEx.PageInfoEx;
import org.zerock.mapper.boardEx.BoardExMapper;

@Service
public class BoardExService {
	
	@Autowired
	private BoardExMapper mapper;
	
	public int register(BoardExDto board) {
		return mapper.insert(board);
	}

	// 
	public List<BoardExDto> listBoard(int page, PageInfoEx pageInfo) {
		int records = 10;
		int offset = (page -1) * records;
		
		int countAll = mapper.countAll(); // 총 레코드 수 > SELECT Count(*) FROM Board
		int lastPage = (countAll - 1) / records + 1;	// 마지막 페이지 번호 

		int leftPageNumber = (page -1) / 10 * 10 + 1;
		int rightPageNumber = leftPageNumber + 9;
		rightPageNumber = Math.min(rightPageNumber, lastPage);
		
		pageInfo.setCurrentPageNumber(page);
		pageInfo.setLeftPageNumber(leftPageNumber);
		pageInfo.setRightPageNumber(rightPageNumber);
		pageInfo.setLastPageNumber(lastPage);
		
		return mapper.list(offset, records);
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
