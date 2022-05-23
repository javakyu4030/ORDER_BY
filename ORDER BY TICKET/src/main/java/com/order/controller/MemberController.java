package com.order.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	@Autowired
	//Service 
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	//--------------------------------------회원가입 페이지-------------------------------------
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public void getSignup() throws Exception{
		logger.info("------------회원가입 페이지 진입----------");
		
	}

	//--------------------------------------회원가입 페이지-------------------------------------
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public void getLogin() throws Exception{
		logger.info("------------회원가입 페이지 진입----------");
		
	}
	
	
}
