package org.zerock.mapper.boardEx;

import java.util.List;

import org.zerock.domain.boardEx.BoardExDto;

public interface BoardExMapper {
	int insert(BoardExDto board);

	List<BoardExDto> list(int offset, int records, String type, String keyword);

	BoardExDto select(int id);

	int update(BoardExDto board);

	int delete(int id);

	int countAll(String type, String keyword);
}
