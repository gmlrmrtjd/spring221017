package org.zerock.controller.lecture.p06jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.domain.lecture.Customer;

@Controller
@RequestMapping("ex24")
public class Controller24 {

	// dataSource 클래스를 import 하고 안에 있는 메소드를 쓰기위한 인스턴스화를 시킨다.
	@Autowired
	private DataSource dataSource;

	@GetMapping("sub01")
	public void listAllCustomers( // customerList를 getAttribute해서 Customer타입으로 구성된 list 형식으로 사용 한다
			@ModelAttribute("customerList") ArrayList<Customer> list) throws Exception {

		String sql = "SELECT "
				+ "CustomerID id, "
				+ "CustomerName name, "
				+ "ContactName, "
				+ "Address, "
				+ "City, "
				+ "PostalCode, "
				+ "Country "
				+ "FROM Customers "
				+ "ORDER BY CustomerID DESC";
		System.out.println(sql);

		try (Connection con = dataSource.getConnection(); // SQLServerDataSource 개체가 나타내는 데이터 원본과의 연결을 설정
				Statement stmt = con.createStatement(); // 데이터베이스로 SQL문을 보내기 위한 SQLServerStatement 개체를 만든다.
				ResultSet rs = stmt.executeQuery(sql);) { // sql 쿼리를 실행하고 쿼리에 의해 생성된 레코드셋을 반환한다.
			System.out.println(con);
			System.out.println(stmt);
			System.out.println(rs);

			while (rs.next()) {
				Customer c = new Customer();
				c.setName(rs.getString("name"));
				c.setAddress(rs.getString("address"));
				c.setCity(rs.getString("city"));
				c.setCountry(rs.getString("country"));
				c.setPostalCode(rs.getString("postalCode"));
				c.setId(rs.getInt("id"));
				c.setContactName(rs.getString("contactname"));

				list.add(c);
//				System.out.println(list);
			}

		}
	}

	@GetMapping("sub02")
	public String listCustomers(
			@RequestParam(name = "page", defaultValue = "1") int page, // int page와 동일하게 변수로 쓰고 싶을 떄 name씀
			@ModelAttribute("customerList") ArrayList<Customer> list,
			@ModelAttribute("pageInfo") HashMap<String, Object> pageInfo) throws Exception {

		String sql = "SELECT "
				+ "CustomerID id, "
				+ "CustomerName name, "
				+ "ContactName, "
				+ "Address, "
				+ "City, "
				+ "PostalCode, "
				+ "Country "
				+ "FROM Customers "
				+ "ORDER BY CustomerID DESC "
				+ "LIMIT ?, ?";

		try (Connection con = dataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setInt(1, (10 * (page - 1)));
			pstmt.setInt(2, 10);

			try (ResultSet rs = pstmt.executeQuery();) {
				while (rs.next()) {
					Customer c = new Customer();
					c.setName(rs.getString("name"));
					c.setAddress(rs.getString("address"));
					c.setCity(rs.getString("city"));
					c.setCountry(rs.getString("country"));
					c.setPostalCode(rs.getString("postalCode"));
					c.setId(rs.getInt("id"));
					c.setContactName(rs.getString("contactName"));

					list.add(c);
				}

			}

		}

		pageInfo.put("current", page);

		return "ex24/sub01";
	}
}
