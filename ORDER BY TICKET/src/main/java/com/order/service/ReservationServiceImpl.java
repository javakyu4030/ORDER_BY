package com.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.dao.ReservationDAO;
import com.order.domain.ReservationChoiceVO;
import com.order.domain.ReservationVO;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	private ReservationDAO dao;
	
	//예매내역 리스트
	@Override
	public List<ReservationVO> list(String member_id) throws Exception {
		return dao.list(member_id);
	}

	//예매선택 메뉴
	@Override
	public List<ReservationChoiceVO> menuList() throws Exception {
		return dao.menuList();
	}

}
