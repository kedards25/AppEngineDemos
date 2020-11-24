package com.learning.appengine.datastoremvc;

public class Employee {

	private String empName;
	private String empMail;
	private String empDept;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String empName, String empMail, String empDept) {
		super();
		this.empName = empName;
		this.empMail = empMail;
		this.empDept = empDept;
	}



	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpMail() {
		return empMail;
	}

	public void setEmpMail(String empMail) {
		this.empMail = empMail;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	
	
	
}
