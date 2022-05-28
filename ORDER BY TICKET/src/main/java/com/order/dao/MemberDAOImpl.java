package com.order.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.order.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {

	@Autowired
	private SqlSession sql;
	
	private static final String NAMESPACE = "com.order.mapper.memberMapper";
	
	//-----------회원가입 정보 삽입--------
	@Override
	public void insertMember(MemberVO vo) throws Exception {
		sql.insert(NAMESPACE+".member_insert",vo);
	}

	   //아이디 중복 체크
	   @Override
	   public int idCheck(MemberVO vo) throws Exception {
	      return sql.selectOne(NAMESPACE + ".idCheck", vo);
	   }

}
