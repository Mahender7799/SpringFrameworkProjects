package com.ibm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmployeeBean {
	private String fullName;
	@Autowired
	@Qualifier(value="depertment2")
	private DepartmentBean depertmentBean;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public DepartmentBean getDepertmentBean() {
		return depertmentBean;
	}

	public void setDepertmentBean(DepartmentBean depertmentBean) {
		this.depertmentBean = depertmentBean;
	}

	@Override
	public String toString() {
		return "EmployeeBean [fullName=" + fullName + ", depertmentBean=" + depertmentBean + "]";
	}

}