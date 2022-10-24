package org.zerock.controller.lecture.p06jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.Instant;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex25")
public class Controller25 {

	@Autowired
	private DataSource dataSource;
	
	@RequestMapping("sub01")
	public void method1() throws Exception {
		String sql = "INSERT INTO myTable07 (col1, col2, col3, col4, col5, col6)"
				+ " VALUES (?, ?, ?, ?, ?, ?)";
		
		try (Connection con = dataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)) {
			
			pstmt.setInt(1, 9999999);
			pstmt.setDouble(2, 298342.333);
			pstmt.setString(3, "hello world");
			pstmt.setString(4, "sql");
			pstmt.setDate(5, java.sql.Date.valueOf("2022-10-01"));
			pstmt.setTimestamp(6, java.sql.Timestamp.valueOf("2011-11-11 12:12:12"));
			
			int cnt = pstmt.executeUpdate();
			
			System.out.println(cnt + "개 레코드 입력 성공");
		}
	}
	
	@RequestMapping("sub02")
	public void method02() throws Exception {
		// mydb1.myTable08 에 레코드 입력하는 코드 작성
		String sql = "INSERT INTO myTable08"
				+ " (name, age, score, address, birthDate, inserted) "
				+ "VALUES (?, ?, ?, ?, ?, ?)";
		
		try (Connection con = dataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)) {
			
			pstmt.setString(1, "captain");
			pstmt.setInt(2, 70);
			pstmt.setDouble(3, 99.9);
			pstmt.setString(4, "seoul korea");
			pstmt.setDate(5, java.sql.Date.valueOf("1999-01-01"));
			pstmt.setTimestamp(6, java.sql.Timestamp.from(Instant.now()));
			
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 레코드 입력됨");
			
		}
	}
	
	@RequestMapping("sub03")
	public void method3() throws Exception {
		String sql = "SELECT col1, col2, col3, col4, col5, col6 FROM myTable07";
		
		try (Connection con = dataSource.getConnection();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {
			
			while (rs.next()) {
				int col1 = rs.getInt("col1");
				double col2 = rs.getDouble("col2");
				String col3 = rs.getString("col3");
				String col4 = rs.getString("col4");
				java.sql.Date col5 = rs.getDate("col5");
				java.sql.Timestamp col6 = rs.getTimestamp("col6");
				
				System.out.println(col1);
				System.out.println(col2);
				System.out.println(col3);
				System.out.println(col4);
				System.out.println(col5);
				System.out.println(col6);
				System.out.println();
			}
		}
	}
	
	@RequestMapping("sub04")
	// myTable08 조회 코드 작성
	public void method4() throws Exception {
		String sql = "SELECT name, age, address, score, birthDate, inserted"
				+ " FROM myTable08";
		try (Connection con = dataSource.getConnection();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {
			
			while (rs.next()) {
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String address = rs.getString("address");
				double score = rs.getDouble("score");
				java.sql.Date birth = rs.getDate("birthDate");
				java.sql.Timestamp inserted = rs.getTimestamp("inserted");
				
				System.out.println(name);
				System.out.println(age);
				System.out.println(address);
				System.out.println(score);
				System.out.println(birth);
				System.out.println(inserted);
				System.out.println();
			}
		}
	}
	
	
}
















