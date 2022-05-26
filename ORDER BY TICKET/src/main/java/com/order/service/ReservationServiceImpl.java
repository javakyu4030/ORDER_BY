package com.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.order.dao.ReservationDAO;
import com.order.domain.HallVO;
import com.order.domain.LocationVO;
import com.order.domain.ReservationVO;
import com.order.domain.ScheduleVO;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	private ReservationDAO dao;
	
	
	//예매내역 리스트
	@Override
	public List<ReservationVO> list(String member_id) throws Exception {
		return dao.list(member_id);
	}

	//예매_지역선택
	@Override
	public List<LocationVO> locationChoice() throws Exception {
		return dao.locationChoice();
	}


	//예매_상영관선택
	@Override
	public List<HallVO> hallChoice() throws Exception {
		return dao.hallChoice();
	}

	//예매_시간선택 
	@Override
	public List<ScheduleVO> ScheduleChoice() throws Exception {
		return dao.ScheduleChoice();
	}
	

}
