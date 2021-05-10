package com.ibm;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeBean {
	
	private String fullName;
	
	@Autowired
	private DepartmentBean departmentBean;
	
	//getter & setters
	
	public DepartmentBean getDepartmentBean1() {
		return departmentBean;
	}

	public void setDepartmentBean1(DepartmentBean departmentBean) {
		this.departmentBean = departmentBean;
	}
	
	public DepartmentBean getDepartmentBean() {
		return departmentBean;
	}
	
	public void setDepartmentBean(DepartmentBean departmentBean) {
		this.departmentBean=departmentBean;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Override
	public String toString() {
		return "EmployeeBean [fullName=" + fullName + ", departmentBean=" + departmentBean + "]";
	}

	
	

}
