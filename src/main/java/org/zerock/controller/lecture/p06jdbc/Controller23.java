package org.zerock.controller.lecture.p06jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex23")
public class Controller23 {

	@Autowired
	private DataSource dataSource;

	@RequestMapping("sub01")
	public void method1() throws Exception {
		String sql = "SELECT * FROM Customers";
		try (Connection con = dataSource.getConnection();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				) {

			if (rs.next()) {
				System.out.println("customerName");
			}
		}

	}
}
