package org.zerock.domain.lecture;

import lombok.Data;

@Data
public class Customer {
	private String name;
	private int id;
	private String contactName;
	private String address;
	private String city;
	private String postalCode;
	private String country;
}
