package com.order.domain;

public class MemberVO {

	/*
 	`member_id` VARCHAR(20) NOT NULL COLLATE 'utf8mb4_general_ci',
	`member_pw` VARCHAR(50) NOT NULL COLLATE 'utf8mb4_general_ci',
	`member_name` VARCHAR(20) NOT NULL COLLATE 'utf8mb4_general_ci',
	`member_email` VARCHAR(50) NOT NULL COLLATE 'utf8mb4_general_ci',
	`member_address` VARCHAR(50) NOT NULL COLLATE 'utf8mb4_general_ci',
	`member_tel` VARCHAR(45) NOT NULL COLLATE 'utf8mb4_general_ci',
	 */
	
	private String member_id;
	private String member_pw;
	private String member_name;
	private String member_email;
	private String member_address;
	private String member_tel;
	
	//-----------------------------------getter setter------------------------------
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getMember_pw() {
		return member_pw;
	}
	public void setMember_pw(String member_pw) {
		this.member_pw = member_pw;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public String getMember_email() {
		return member_email;
	}
	public void setMember_email(String member_email) {
		this.member_email = member_email;
	}
	public String getMember_address() {
		return member_address;
	}
	public void setMember_address(String member_address) {
		this.member_address = member_address;
	}
	public String getMember_tel() {
		return member_tel;
	}
	public void setMember_tel(String member_tel) {
		this.member_tel = member_tel;
	}
	
	//-----------------------------------Constructor------------------------------
	public MemberVO() {	//기본생성자
		
	}
	public MemberVO(String member_id, String member_pw, String member_name, String member_email, String member_address,
			String member_tel) {
		super();
		this.member_id = member_id;
		this.member_pw = member_pw;
		this.member_name = member_name;
		this.member_email = member_email;
		this.member_address = member_address;
		this.member_tel = member_tel;
	}
	
	//-----------------------------------toString------------------------------
	@Override
	public String toString() {
		return "MemberVO [member_id=" + member_id + ", member_pw=" + member_pw + ", member_name=" + member_name
				+ ", member_email=" + member_email + ", member_address=" + member_address + ", member_tel=" + member_tel
				+ "]";
	}
	
	
	
}
