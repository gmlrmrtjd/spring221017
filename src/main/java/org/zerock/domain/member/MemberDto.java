package org.zerock.domain.member;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class MemberDto {

	private String id;
	private String email;
	private String password;
	
	private LocalDateTime inserted;
}
