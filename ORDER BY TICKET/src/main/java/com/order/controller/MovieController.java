package com.order.controller;

import java.io.Console;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping("/movie/*")
public class MovieController {

	@Autowired
	//Service service;
	
	private static final Logger logger = LoggerFactory.getLogger(MovieController.class);
	
	@RequestMapping(value = "/movieInform", method = RequestMethod.GET)
	public void getMovieInform(HttpSession session, Model model) throws Exception{
		logger.info("------------영화 정보 페이지 진입(GET)----------");
		// movie DB 삽입 테스트
		
		Object movieInfo_member_id = session.getAttribute("member_id");
		logger.info("movieInfo_member_id:{}",movieInfo_member_id);
		model.addAttribute("sessionMember_id",movieInfo_member_id);
		
	}
	@RequestMapping(value = "/movieInform", method = RequestMethod.POST)
	public void posrMovieInform(HttpSession session) throws Exception{
		logger.info("------------영화 정보 페이지 진입(POST)----------");
		//원래는 GET 방식으로 넣어야됨.  login.jsp 에서 GET으로 변경 가능 할 경우 GET 방식으로 하기
	}
	
}
