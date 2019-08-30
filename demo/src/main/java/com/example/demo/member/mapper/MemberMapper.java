package com.example.demo.member.mapper;

import org.springframework.stereotype.Repository;

@Repository("com.example.demo.member.mapper.MemberMapper")
public interface MemberMapper {
	public int memberCount() throws Exception;
}
