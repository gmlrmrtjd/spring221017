package org.zerock.mapper.board;

import java.util.List;

import org.zerock.domain.board.ReplyDto;

public interface ReplyMapper {

	int insert(ReplyDto reply);
	
	List<ReplyDto> selectReplyByBoardId(int boardId);
	
	int deleteById(int id);

	ReplyDto selectById(int id);

	int update(ReplyDto reply);
	
	int deleteByBoardId(int id);
	
	int countReply(int id);

}
