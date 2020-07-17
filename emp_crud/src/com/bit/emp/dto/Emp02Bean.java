package com.bit.emp.dto;

import java.sql.Date;

// javaBean
// 캡슐화 (정보를 은닉시켜 원하는 제어만 제공)
// 	getter & setter 구성
public class Emp02Bean {
	private int sabun;
	private String name;
	private Date nalja;
	private int pay;

	//sabun
	public void setSabun(int sabun){
		this.sabun =sabun;
	}
	public int getSabun(){
		return this.sabun;
	}
	
	//name
	public void setName(String name){
		this.name =name;
	}
	public String getName(){
		return this.name;
	}
	
	//nalja
	public void setNalja(Date nalja){
		this.nalja =nalja;
	}
	public Date getNalja() {
		return nalja;
	}
	
	//pay
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getPay() {
		return pay;
	}
}







