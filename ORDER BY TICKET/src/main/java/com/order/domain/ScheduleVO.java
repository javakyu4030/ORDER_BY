package com.order.domain;

public class ScheduleVO {

	/*
	`s_schedule_no` VARCHAR(20) NOT NULL COLLATE 'utf8mb4_general_ci',
	`s_date` VARCHAR(50) NOT NULL COLLATE 'utf8mb4_general_ci',
	`s_startTime` VARCHAR(45) NOT NULL COLLATE 'utf8mb4_general_ci',
	`s_endTime` VARCHAR(45) NOT NULL COLLATE 'utf8mb4_general_ci',
	`location_no` INT(11) NOT NULL,
	 */
	
	private String s_schedule_no;
	private String s_date;	
	private String s_startTime;	
	private String s_endTime; 	
	private int location_no;	//fk	
	
	//------------------------------------getter setter------------------------------------
	
	public String getS_schedule_no() {
		return s_schedule_no;
	}
	public void setS_schedule_no(String s_schedule_no) {
		this.s_schedule_no = s_schedule_no;
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
	public String getS_endTime() {
		return s_endTime;
	}
	public void setS_endTime(String s_endTime) {
		this.s_endTime = s_endTime;
	}
	public int getLocation_no() {
		return location_no;
	}
	public void setLocation_no(int location_no) {
		this.location_no = location_no;
	}
	
	//------------------------------------Constructor------------------------------------

	public ScheduleVO() {	//기본생성자
		
	}
	public ScheduleVO(String s_schedule_no, String s_date, String s_startTime, String s_endTime, int location_no) {
		super();
		this.s_schedule_no = s_schedule_no;
		this.s_date = s_date;
		this.s_startTime = s_startTime;
		this.s_endTime = s_endTime;
		this.location_no = location_no;
	}
	
	//------------------------------------------toString---------------------------------------
	@Override
	public String toString() {
		return "ScheduleVO [s_schedule_no=" + s_schedule_no + ", s_date=" + s_date + ", s_startTime=" + s_startTime
				+ ", s_endTime=" + s_endTime + ", location_no=" + location_no + "]";
	}
	
	
}
