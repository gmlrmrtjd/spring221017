package org.zerock.domain.lecture;

import java.util.List;

import lombok.Data;
// supplier
@Data
public class JavaBean12 {
	private int id; // supplierId
	private String name; // supplierName
	private List<String> productName; // productName
	
	private List<JavaBean14> product;

}
