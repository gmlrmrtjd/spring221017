package org.zerock.domain.lecture;

import java.time.LocalDate;

import lombok.Data;

@Data
public class JavaBean07 {
	private int id;
	private LocalDate date;
	private int employeeId;
	private String employeeFirstName;
	private String employeeLastName;
}
