package org.zerock.domain.board;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class BoardDto {
	private int id;
	private String title;
	private String content;
	private String writer;
	private LocalDateTime inserted;
}
