package org.zerock.domain.lecture;

import java.util.List;

import lombok.Data;

@Data
public class JavaBean11 { // 실제 프로젝트에선 CategoryDTO라고 쓸듯 

	private int id;
	private String name;
	private List<String> productName;
}
