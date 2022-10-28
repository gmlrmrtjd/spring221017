package org.zerock.domain.lecture;

import java.util.List;

import lombok.Data;
// category
@Data
public class JavaBean13 {
	
	private int id;
	private String name;
	
	private List<JavaBean14> product;
}
