package org.zerock.mapper.lecture;

import java.util.List;

import org.zerock.domain.lecture.JavaBean04;
import org.zerock.domain.lecture.JavaBean16;
import org.zerock.domain.lecture.JavaBean17;

public interface Mapper09 {
	
	String getCustomerNameById(int id);
	
	String getEmployeeFirstNameById(int employeeId);
	
	List<String> getCustomerNameByCityAndCountry(String city, String country);
	
	String getSupplierNameByCityAndCountry(String nation, String location);
	
	String getContactName(JavaBean04 bean1);
	
	String getSupplierContactName(JavaBean04 bean1);
	
	List<String> getProductName(JavaBean16 b16, JavaBean17 b17);
}
