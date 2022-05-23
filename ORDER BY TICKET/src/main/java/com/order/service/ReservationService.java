package com.order.service;

import java.util.List;

import com.order.domain.ReservationChoiceVO;
import com.order.domain.ReservationVO;

public interface ReservationService {

	//예매내역 리스트
	public List<ReservationVO> list(String member_id) throws Exception;
	
	//예매선택 메뉴
	public List<ReservationChoiceVO> menuList() throws Exception;
}
