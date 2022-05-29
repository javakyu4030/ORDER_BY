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
	public String getMovieInform(HttpSession session, Model model) throws Exception{
		logger.info("------------영화 정보 페이지 진입(GET)----------");
		// movie DB 삽입 테스트
		
		
		
		//세션 값이 없을 경우 login 창으로 리턴
		//원래는 GET 방식으로 넣어야됨. login.jsp 에서 GET으로 변경 가능 할 경우 GET 방식으로 하기(수정완료)
		Object sessionCheck = session.getAttribute("member_id");
		model.addAttribute("sessionCheck", sessionCheck);
//		model.addAttribute("msg", "로그인 후 이용 바랍니다.");
//		model.addAttribute("url", "/member/login");

		if(sessionCheck==null) {
			logger.info("저장된 세션 ID값과 불일치");
			return "redirect:/member/login";
		}
		return null;
	}
	
	@RequestMapping(value = "/movieInform", method = RequestMethod.POST)
	public void posrMovieInform(HttpSession session, Model model) throws Exception{
		logger.info("------------영화 정보 페이지 진입(POST)----------");
		
	}
	
	
	
}
