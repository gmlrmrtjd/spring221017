package org.zerock.mapper.member;

import java.util.List;

import org.zerock.domain.member.MemberDto;

public interface MemberMapper {

	int insert(MemberDto member);

	List<MemberDto> selectAll();

	MemberDto selectById(String id);

	int update(MemberDto member);

	int deleteById(String id);

}
