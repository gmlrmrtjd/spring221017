package org.zerock.mapper.lecture;

import org.zerock.domain.lecture.JavaBean18;

public interface Mapper10 {
	int removeCustomer();
	
	int removeEmployee();
	
	int removeCustomerById(int id);
	
	int removeEmployeeById(int id);
	
	int addCustomer();
	
	int addSupplier();
	
	int insertCustomer(JavaBean18 customer);
}
