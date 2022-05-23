package com.order.domain;

public class SeatVO {

	/*
	`seat_no` INT(11) NOT NULL,
	`seat_position` INT(11) NOT NULL,
	`seat_reservation` INT(11) NOT NULL,
	`hall_no` INT(11) NOT NULL,
	 */

	private int seat_no;
	private int seat_position;
	private int seat_reservation;
	private int hall_no;	//fk
	
	//-----------------------------------getter setter------------------------------
	public int getSeat_no() {
		return seat_no;
	}
	public void setSeat_no(int seat_no) {
		this.seat_no = seat_no;
	}
	public int getSeat_position() {
		return seat_position;
	}
	public void setSeat_position(int seat_position) {
		this.seat_position = seat_position;
	}
	public int getSeat_reservation() {
		return seat_reservation;
	}
	public void setSeat_reservation(int seat_reservation) {
		this.seat_reservation = seat_reservation;
	}
	public int getHall_no() {
		return hall_no;
	}
	public void setHall_no(int hall_no) {
		this.hall_no = hall_no;
	}
	
	
	//-----------------------------------constructor------------------------------
	public SeatVO() {	//기본생성자
		
	}
	
	public SeatVO(int seat_no, int seat_position, int seat_reservation, int hall_no) {
		super();
		this.seat_no = seat_no;
		this.seat_position = seat_position;
		this.seat_reservation = seat_reservation;
		this.hall_no = hall_no;
	}
	
	//-----------------------------------toString------------------------------
	@Override
	public String toString() {
		return "SeatVO [seat_no=" + seat_no + ", seat_position=" + seat_position + ", seat_reservation="
				+ seat_reservation + ", hall_no=" + hall_no + "]";
	}
	
}
