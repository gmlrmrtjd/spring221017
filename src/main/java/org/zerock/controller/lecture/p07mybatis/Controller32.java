package org.zerock.controller.lecture.p07mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.lecture.JavaBean06;
import org.zerock.domain.lecture.JavaBean07;
import org.zerock.domain.lecture.JavaBean08;
import org.zerock.mapper.lecture.Mapper05;

@Controller
@RequestMapping("ex32")
public class Controller32 {

	@Autowired
	private Mapper05 mapper;
	
	@RequestMapping("sub01")
	public void method1() {
		JavaBean07 order = mapper.getOrder();
		System.out.println(order);
	}
	
	@RequestMapping("sub02")
	public void method2() {
		JavaBean08 order = mapper.getOrder2();
		System.out.println(order);
	}

	
	/*
SELECT 
p.productId,
p.productName,
p.price,
s.supplierId,
s.supplierName,
s.phone
FROM 
Products p JOIN Suppliers s
ON p.SupplierID = s.SupplierID
WHERE
p.ProductID = 10
	 */
	// '10', 'Ikura', '31.00', '4', 'Tokyo Traders', '(03) 3555-5011'

	@RequestMapping("sub03")
	public void method3() {
		JavaBean06 product = mapper.getProduct();
		System.out.println(product.getId()); // 10
		System.out.println(product.getName()); // Ikura
		System.out.println(product.getPrice()); // 31.00
		System.out.println(product.getSupplier().getId()); // 4
		System.out.println(product.getSupplier().getName()); // Tokyo Traders
		System.out.println(product.getSupplier().getPhone()); // (03) 3555-5011
	}

}
