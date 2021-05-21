package com.mdits.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
		
@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empID;
	
	private String fName;
	private String lName;
	private String address;
	private double salary;
	private char gender;
	private int dno;
	
	
	  @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	  @JoinColumn(name = "dno", referencedColumnName = "dNumber",insertable =
	  false, updatable = false) 
	  private Department department;
	 
}
