package com.order.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping("/movie/*")
public class MovieController {

	@Autowired
	//Service service;
	
	private static final Logger logger = LoggerFactory.getLogger(MovieController.class);
	
	@RequestMapping(value = "/movieInform", method = RequestMethod.GET)
	public void getMovieInform() throws Exception{
		logger.info("------------영화 정보 페이지 진입----------");
		
		
	}
}
