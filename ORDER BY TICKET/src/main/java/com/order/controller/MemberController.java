package com.order.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.order.domain.MemberVO;
import com.order.service.MemberService;


@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	@Autowired
	private MemberService service;
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	//--------------------------------------회원가입 페이지-------------------------------------
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public void getSignup(Model model) throws Exception{
		logger.info("------------회원가입 페이지 진입----------");
	
		
	}
	
	
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String postSignup(MemberVO vo, @RequestParam(name="emailId")String emailId,
											@RequestParam(name="emailDomain")String emailDomain,
											@RequestParam(name="phone1")String phone1,
											@RequestParam(name="phone2")String phone2,
											@RequestParam(name="phone3")String phone3) throws Exception{
		
		
		
																
		String member_email=emailId+"@"+emailDomain;
		logger.info("member_email : {}",member_email);
		
		String member_tel = phone1+phone2+phone3;
		logger.info("member_tel : {}",member_tel);
		vo.setMember_tel(member_tel);
		
		vo.setMember_email(member_email);
		logger.info("------------회원가입_POST_ 진입----------");
		logger.info("vo : {}",vo);
		
			service.insertMember(vo);
		
		return "redirect:/";
		
	}

	   //---------------------------------아이디 중복 체크-------------------------------------
	   @ResponseBody
	   @RequestMapping(value = "/idCheck", method = RequestMethod.POST)
	   public int idCheck(MemberVO vo) throws Exception {

		   logger.info("아이디 체크 진입");
	      int result = service.idCheck(vo);
	      logger.info("result : {}",result);
	      return result;
	   }

	
	//--------------------------------------회원가입 페이지-------------------------------------
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public void getLogin() throws Exception{
		logger.info("------------회원가입 페이지 진입----------");
		
	}
	
	//--------------------------------------로그인-------------------------------------
	//--------------------------------------로그인-------------------------------------
	//--------------------------------------로그인-------------------------------------
	//--------------------------------------로그인-------------------------------------
	
}
