package org.zerock.domain.lecture;

import java.time.LocalDate;

import lombok.Data;

@Data
public class JavaBean08 {
	
	private int id;
	private LocalDate date;
	private JavaBean05 employee;

}
