package org.zerock.domain.board;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import lombok.Data;
@Data
public class ReplyDto {
	private int id;
	private int boardId;
	private String content;
	
	@JsonFormat(shape = Shape.STRING)
	private LocalDateTime inserted;
	
}
