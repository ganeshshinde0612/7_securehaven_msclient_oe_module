package com.securehaven._securehaven_msclient_oe_module.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Customer_Family_Details {
	
	private int id;
	
	private String fatherName;
	
	private String motherName;
	
	private int noOfChild;
	
	private int noOfFamilyMember;
	
	private long familyIncome;
	

}
