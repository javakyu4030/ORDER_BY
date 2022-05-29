package com.order.controller;

import java.util.List;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.order.domain.HallVO;
import com.order.domain.LocationVO;
import com.order.domain.ReservationVO;
import com.order.domain.ScheduleVO;
import com.order.service.ReservationService;


@Controller
@RequestMapping("/reservation/*")
public class ReservationController {

	@Autowired
	private JavaMailSender mailSender;
	
	@Autowired
	private ReservationService reservationService;
	
	private static final Logger logger = LoggerFactory.getLogger(ReservationController.class);
	
	
    
	//----------------------------메일발송 JSP 로 이동------------------------
	@RequestMapping(value = "/mailSend", method = RequestMethod.GET)
	public void getMailSend() throws Exception {
		logger.info("--------------메일발송 JSP진입--------------");
	}
	
	//--------------------------------메일발송-----------------------------
	//mailSend 코드
	@RequestMapping(value = "/mailSend", method = RequestMethod.POST)
	public String mailSend(HttpServletRequest request,String name,String last_name,String email,String phone,String message) throws Exception{
		try {
			
			MimeMessage mimeMessage = mailSender.createMimeMessage();
		   // MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true, "UTF-8");
		    MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true, "UTF-8");
		    logger.info("Message {}", mimeMessage);
 
		    //test용 메일 내용
		    messageHelper.setFrom("orderbyticket@gmail.com"); // 보내는사람 이메일 여기선 google 메일서버 사용하는 아이디를 작성하면됨
		    messageHelper.setTo(email); // 받는사람 이메일
		    messageHelper.setSubject("[티켓예약] 안녕하세요 ORDER BY TICKET 입니다" ); // 메일제목
		    //messageHelper.setText("예약하신 회원님은"+ name + last_name + "입니다."+" 연락처는 " + phone + "입니다. 입력한 Email은 " + email + "입니다."); // 메일 내용
		    //messageHelper.setText("text/html","<div style='border: 3px solid blue'><a href='https://www.naver.com/'>message</a></div>");
		    //messageHelper.setText("text/html","<html> <head> <meta name=\"viewport\" content=\"width=device-width, height=device-height, minimum-scale=1.0, maximum-scale=1.0, initial-scale=1.0\"> </head> <body> <header> <h2>Login</h2> </header> <form action=\"\" method=\"POST\"> <div class=\"input-box\"> <input id=\"username\" type=\"text\" name=\"username\" placeholder=\"아이디\"> <label for=\"username\">아이디</label> </div> <div class=\"input-box\"> <input id=\"password\" type=\"password\" name=\"password\" placeholder=\"비밀번호\"> <label for=\"password\">비밀번호</label> </div> <div id=\"forgot\">비밀번호 찾기</div> <input type=\"submit\" value=\"로그인\"> </form> </body> </html>");
		    //messageHelper.setText("text/html","<html>");
		    //messageHelper.setText("text/html","<body>");
		    messageHelper.setText("text/html",
									    		"<h1>"+"ORDER BY TICKET"+"</h1>"+
								    			"<hr>"+
							    				"<br>"+
								    			"<div>"+message+"</div>"+"입니다"
							    				);
		   
		    
		    mailSender.send(mimeMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "redirect:/";
	}
	
	//----------------------------예약 페이지_GET------------------------
	@RequestMapping(value = "/movieChoice", method = RequestMethod.GET)
	public void getReservation(Model model, HttpSession session)throws Exception {
		logger.info("---------예약 페이지_GET 이동------");
		
		//지역 선택
		logger.info("---------예약페이지_지역선택------");
		List<LocationVO> location = reservationService.locationChoice();
		logger.info("reservationService.locationChoice() : {}",location );
		model.addAttribute("locationChoice",location);
		//상영관 선택
		logger.info("---------예약페이지_상영관선택------");
		List<HallVO> hall = reservationService.hallChoice();
		logger.info("reservationService.hallChoice() : {}",hall );
		model.addAttribute("hallChoice",hall);
		//시간 선택
		logger.info("---------예약페이지_상영관선택------");
		List<ScheduleVO> Schedule = reservationService.ScheduleChoice();
		logger.info("reservationService.ScheduleChoice() : {}",Schedule );
		model.addAttribute("ScheduleChoice",Schedule);
		
		//세션 아이디정보
		Object movieChoice_member_id = session.getAttribute("member_id");
		logger.info("sessionMember_id:{}",movieChoice_member_id);
		model.addAttribute("sessionMember_id",movieChoice_member_id);
		
	}
	

	//----------------------------예매내역 확인 페이지_GET------------------------
	@RequestMapping(value = "/reservationConfirm", method = RequestMethod.GET)
	public void getReservationConfirm(@RequestParam(name="member_id",	
													required=false)String member_id ,
													Model model,
													HttpSession session)throws Exception {
		
		logger.info("--------예매내역리스트 페이지------");
		logger.info("member_id : {}",member_id);
		
			List<ReservationVO> list = reservationService.list(member_id);
			model.addAttribute("reservationList",list);
			
			//세션 아이디정보
			Object resrvation_member_id = session.getAttribute("member_id");
			logger.info("sessionMember_id:{}",resrvation_member_id);
			model.addAttribute("sessionMember_id",resrvation_member_id);
	}
}//ReservationController class end
