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
	public List<BoardExDto> listBoard(int page, String type, String keyword, PageInfoEx pageInfo) {
		int records = 10;
		int offset = (page -1) * records;
		
		int countAll = mapper.countAll(type, "%" + keyword + "%"); // 총 레코드 수 > SELECT Count(*) FROM Board
		int lastPage = (countAll - 1) / records + 1;	// 마지막 페이지 번호 

		int leftPageNumber = (page -1) / 10 * 10 + 1;
		int rightPageNumber = leftPageNumber + 9;
		rightPageNumber = Math.min(rightPageNumber, lastPage);
		
		// 이전버튼 유무
		boolean hasPrevButton = page > 10;
		// 다음버튼 유무 
		boolean hasNextButton = page <= ((lastPage - 1) / 10 * 10);
		
		// 이전버튼 눌렀을 때 가는 페이지 번호
		int jumpPrevPageNumber = (page - 1) / 10 * 10 - 9;
		int jumpNextPageNumber = (page - 1) / 10 * 10 + 11;
		
		pageInfo.setHasPrevButton(hasPrevButton);
		pageInfo.setHasNextButton(hasNextButton);
		pageInfo.setJumpPrevPageNumber(jumpPrevPageNumber);
		pageInfo.setJumpNextPageNumber(jumpNextPageNumber);
		pageInfo.setCurrentPageNumber(page);
		pageInfo.setLeftPageNumber(leftPageNumber);
		pageInfo.setRightPageNumber(rightPageNumber);
		pageInfo.setLastPageNumber(lastPage);
		
		return mapper.list(offset, records, type, "%" + keyword + "%");
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
