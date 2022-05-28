package com.order.dao;

import com.order.domain.MemberVO;

public interface MemberDAO {

	//회원가입 정보 삽입
	public void insertMember(MemberVO vo) throws Exception;
	
	//회원아이디 호출
	 public int idCheck(MemberVO vo) throws Exception;
	
		//로그인 아이디,비밀번호 체크
	 public int loginCheck(MemberVO vo) throws Exception;
}
