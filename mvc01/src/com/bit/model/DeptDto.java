package com.bit.model;

public class DeptDto { // data transform object ������ �̵���ų�� �׷�ȭ
	private int deptno;
	private String dname;
	private String loc;
	
	public DeptDto(){}//�ݵ�� ����Ʈ �����ڸ� ��� �� ��
	
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
}
