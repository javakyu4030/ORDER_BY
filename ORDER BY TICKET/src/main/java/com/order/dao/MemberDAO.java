package com.order.dao;

import com.order.domain.MemberVO;

public interface MemberDAO {

	//회원가입 정보 삽입
	public void insertMember(MemberVO vo) throws Exception;
	
	//회원아이디 호출
	 public int idCheck(MemberVO vo) throws Exception;
	
}
