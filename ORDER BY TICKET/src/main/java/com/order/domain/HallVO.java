package com.order.domain;

public class HallVO {

	/*
	`hall_no` INT(11) NOT NULL AUTO_INCREMENT,
	`hall_name` VARCHAR(10) NOT NULL COLLATE 'utf8mb4_general_ci',
	`location_no` INT(11) NOT NULL, 
	 */

	private int hall_no;
	private String hall_name;
	private int location_no;	//fk
	
	//-----------------------------------getter setter------------------------------
	public int getHall_no() {
		return hall_no;
	}
	public void setHall_no(int hall_no) {
		this.hall_no = hall_no;
	}
	public String getHall_name() {
		return hall_name;
	}
	public void setHall_name(String hall_name) {
		this.hall_name = hall_name;
	}
	public int getLocation_no() {
		return location_no;
	}
	public void setLocation_no(int location_no) {
		this.location_no = location_no;
	}
	
	//-----------------------------------constructor------------------------------
	public HallVO() {	// 기본 생성자
		
	}
	
	public HallVO(int hall_no, String hall_name, int location_no) {
		super();
		this.hall_no = hall_no;
		this.hall_name = hall_name;
		this.location_no = location_no;
	}

	//-----------------------------------toString------------------------------
	@Override
	public String toString() {
		return "hallVO [hall_no=" + hall_no + ", hall_name=" + hall_name + ", location_no=" + location_no + "]";
	}
	
	
}
