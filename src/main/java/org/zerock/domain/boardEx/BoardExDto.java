package org.zerock.domain.boardEx;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class BoardExDto {
	private int id;
	private String title;
	private String content;
	private String writer;
	private LocalDateTime inserted;
}
