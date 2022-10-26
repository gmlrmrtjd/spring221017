package org.zerock.domain.lecture;

import lombok.Data;

@Data
public class JavaBean06 {
	private int id;
	private Double price;
	private String name;
	private JavaBean09 supplier;
}
