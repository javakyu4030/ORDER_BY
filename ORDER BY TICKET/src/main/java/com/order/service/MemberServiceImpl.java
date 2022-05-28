package com.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.dao.MemberDAO;
import com.order.domain.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDAO dao;
	
	
	//-------------회원가입 정보 삽입---------------
	@Override
	public void insertMember(MemberVO vo) throws Exception {
		dao.insertMember(vo);
	}


	 //-----------------아이디 중복 체크---------------
    @Override
    public int idCheck(MemberVO vo) throws Exception {
       return dao.idCheck(vo);
    }

}
