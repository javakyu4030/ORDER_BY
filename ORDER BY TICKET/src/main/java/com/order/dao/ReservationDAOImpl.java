package com.order.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.order.domain.ReservationChoiceVO;
import com.order.domain.ReservationVO;

@Repository
public class ReservationDAOImpl implements ReservationDAO {

	@Autowired
	private SqlSession sql;
	
	public static String namespace = "com.order.mapper.reservationMapper";
	
	
	//예매내역 리스트
	@Override
	public List<ReservationVO> list(String member_id) throws Exception {
		return sql.selectList(namespace+".reservationlist",member_id);
	}

	//예매선택 메뉴
	@Override
	public List<ReservationChoiceVO> menuList() throws Exception {
		return sql.selectList(namespace+".reservationMenu");
	}

}
