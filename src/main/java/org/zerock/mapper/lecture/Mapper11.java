package org.zerock.mapper.lecture;

import org.zerock.domain.lecture.JavaBean18;
import org.zerock.domain.lecture.JavaBean19;

public interface Mapper11 {
	// int updateCustomer(String name, String customerName, String address);
	int updateCustomer(JavaBean18 customer);
	JavaBean18 getCustomerById(int id);
	
	int updateSupplier(JavaBean19 supplier);
	JavaBean19 getSupplierById(int id);
	
	int updateBank(int account, int money);
}
