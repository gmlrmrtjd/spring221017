package org.zerock.mapper.lecture;

import org.apache.ibatis.annotations.Select;

public interface Mapper01 {

	@Select("SELECT NOW()")
	public String getCurrentTime();
	
	@Select("SELECT CustomerName FROM w3schools.Customers WHERE CustomerId = 77")
	public String getCustomerName();
	
	public String getEmployeeName();
	
	public String getProductName();
	
	public double getPrice();
	
	public int getQuantity();
	
//	public Date getBirthDate();
	public java.time.LocalDate getBirthDate();
}
