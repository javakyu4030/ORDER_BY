package com.order.dao;

import java.util.List;

import com.order.domain.ReservationChoiceVO;
import com.order.domain.ReservationVO;

public interface ReservationDAO {

	//예매내역 조회
	public List<ReservationVO> list(String member_id)throws Exception; 
	
	//예매선택 매뉴
	public List<ReservationChoiceVO> menuList() throws Exception;
}
