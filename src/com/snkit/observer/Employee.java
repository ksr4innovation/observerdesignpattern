package com.snkit.observer;

public class Employee {
	
	private String empid;
	
	private String name;
	
	private String des;
	
	

	public Employee(String empid, String name, String des) {
		super();
		this.empid = empid;
		this.name = name;
		this.des = des;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}
	
	

}
