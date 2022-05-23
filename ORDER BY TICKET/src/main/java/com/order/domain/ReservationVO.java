package com.order.domain;

public class ReservationVO {

	/*
	`reservation_no` INT(11) NOT NULL,
	`reservation_nowdate` DATETIME NOT NULL,
	`member_id` VARCHAR(20) NOT NULL COLLATE 'utf8mb4_general_ci',
	`s_date` VARCHAR(20) NOT NULL COLLATE 'utf8mb4_general_ci',
	`location_no` INT(11) NOT NULL,
	`movie_name` VARCHAR(20) NOT NULL COLLATE 'utf8mb4_general_ci',
	 */
	private int reservation_no;
	private String reservation_nowdate;
	private String member_id;	//fk
	private String s_date;	//fk
	private int location_no;	//fk
	private String movie_name;	//fk
	
	//------------------------------------getter setter------------------------------------
	
	
	public int getReservation_no() {
		return reservation_no;
	}
	
	public void setReservation_no(int reservation_no) {
		this.reservation_no = reservation_no;
	}
	
	public String getReservation_nowdate() {
		return reservation_nowdate;
	}
	
	public void setReservation_nowdate(String reservation_nowdate) {
		this.reservation_nowdate = reservation_nowdate;
	}
	
	public String getMember_id() {
		return member_id;
	}
	
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	
	public String getS_date() {
		return s_date;
	}
	
	public void setS_date(String s_date) {
		this.s_date = s_date;
	}
	
	public int getLocation_no() {
		return location_no;
	}
	
	public void setLocation_no(int location_no) {
		this.location_no = location_no;
	}
	
	public String getMovie_name() {
		return movie_name;
	}
	
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	//------------------------------------Constructor------------------------------------
	public ReservationVO() {	//기본 생성자
		
	}

	public ReservationVO(int reservation_no, String reservation_nowdate, String member_id, String s_date,
			int location_no, String movie_name) {
		super();
		this.reservation_no = reservation_no;
		this.reservation_nowdate = reservation_nowdate;
		this.member_id = member_id;
		this.s_date = s_date;
		this.location_no = location_no;
		this.movie_name = movie_name;
	}

	
	//------------------------------------toString------------------------------------
	@Override
	public String toString() {
		return "ReservationVO [reservation_no=" + reservation_no + ", reservation_nowdate=" + reservation_nowdate
				+ ", member_id=" + member_id + ", s_date=" + s_date + ", location_no=" + location_no + ", movie_name="
				+ movie_name + "]";
	}
	
	
}
