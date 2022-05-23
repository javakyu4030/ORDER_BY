package com.order.domain;

public class ReservationChoiceVO {

	/*
	 l.location
	  h.hall_name
	   s.s_date
	   s.s_startTime
	 */
	
	private String location;
	private String hall_name;
	private String s_date;
	private String s_startTime;

	//----------------------------------getter setter----------------------------
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getHall_name() {
		return hall_name;
	}
	public void setHall_name(String hall_name) {
		this.hall_name = hall_name;
	}
	public String getS_date() {
		return s_date;
	}
	public void setS_date(String s_date) {
		this.s_date = s_date;
	}
	public String getS_startTime() {
		return s_startTime;
	}
	public void setS_startTime(String s_startTime) {
		this.s_startTime = s_startTime;
	}
	
	//----------------------------------Constructor----------------------------
	public ReservationChoiceVO() {	//기본생성자
		
	}
	
	public ReservationChoiceVO(String location, String hall_name, String s_date, String s_startTime) {
		super();
		this.location = location;
		this.hall_name = hall_name;
		this.s_date = s_date;
		this.s_startTime = s_startTime;
	}
	
	//----------------------------------toString---------------------------------
	@Override
	public String toString() {
		return "ReservationChoiceVO [location=" + location + ", hall_name=" + hall_name + ", s_date=" + s_date
				+ ", s_startTime=" + s_startTime + "]";
	}
	
	
	
}
