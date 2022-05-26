package com.order.dao;

import java.util.List;

import com.order.domain.HallVO;
import com.order.domain.LocationVO;
import com.order.domain.ReservationVO;
import com.order.domain.ScheduleVO;

public interface ReservationDAO {

	//예매내역 조회
	public List<ReservationVO> list(String member_id)throws Exception; 
	
	//예매_지역선택
	public List<LocationVO> locationChoice() throws Exception;
	
	//예매_상영관선택
	public List<HallVO> hallChoice() throws Exception;

	//예매_시간선택
	public List<ScheduleVO> ScheduleChoice() throws Exception;
}
