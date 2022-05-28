package com.order.service;

import com.order.domain.MemberVO;

public interface MemberService {

	//회원가입 정보 삽입
	public void insertMember(MemberVO vo) throws Exception;
	
	//아이디 중복 체크
	public int idCheck(MemberVO vo) throws Exception ;
	
}
