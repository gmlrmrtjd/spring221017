package org.zerock.mapper.boardEx;

import java.util.List;

import org.zerock.domain.boardEx.BoardExDto;

public interface BoardExMapper {
	int insert(BoardExDto board);

	List<BoardExDto> list();

	BoardExDto select(int id);

	int update(BoardExDto board);

	int delete(int id);
}
