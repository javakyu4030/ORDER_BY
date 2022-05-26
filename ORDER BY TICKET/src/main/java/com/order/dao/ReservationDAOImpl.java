package com.order.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.order.domain.HallVO;
import com.order.domain.LocationVO;
import com.order.domain.ReservationChoiceVO;
import com.order.domain.ReservationVO;
import com.order.domain.ScheduleVO;

@Repository
public class ReservationDAOImpl implements ReservationDAO {

	@Autowired
	private SqlSession sql;
	
	public static String namespace = "com.order.mapper.reservationMapper";
	
	
	//예매_지역 선택
	@Override
	public List<LocationVO> locationChoice() throws Exception {
		return sql.selectList(namespace+".locationChoice");
	}

	//예매내역 리스트
	@Override
	public List<ReservationVO> list(String member_id) throws Exception {
		return sql.selectList(namespace+".reservationlist",member_id);
	}

	//예매_상영관선택
	@Override
	public List<HallVO> hallChoice() throws Exception {
		return sql.selectList(namespace+".hallChoice");
	}

	//예매_시간선택
	@Override
	public List<ScheduleVO> ScheduleChoice() throws Exception {
		return sql.selectList(namespace+".scheduleChoice");
	}


	
	

}
