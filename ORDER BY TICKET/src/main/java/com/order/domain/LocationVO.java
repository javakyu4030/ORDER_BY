package com.order.domain;

public class LocationVO {

	/*
	`location_no` INT(11) NOT NULL AUTO_INCREMENT,
	`location` VARCHAR(10) NOT NULL COLLATE 'utf8mb4_general_ci',
	 */

	private int location_no;	//pk
	private String location;
	
	//-----------------------------------getter setter------------------------------
	public int getLocation_no() {
		return location_no;
	}

	public void setLocation_no(int location_no) {
		this.location_no = location_no;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	//-----------------------------------constructor------------------------------
	public LocationVO() {	//기본생성자
		
	}
	
	public LocationVO(int location_no, String location) {
		super();
		this.location_no = location_no;
		this.location = location;
	}

	//-----------------------------------toString------------------------------
	@Override
	public String toString() {
		return "locationVO [location_no=" + location_no + ", location=" + location + "]";
	}
	
}
