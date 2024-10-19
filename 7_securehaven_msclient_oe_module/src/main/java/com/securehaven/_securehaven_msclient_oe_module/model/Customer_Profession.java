package com.securehaven._securehaven_msclient_oe_module.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Customer_Profession {

	private int id;
	
	private String professionType;
	
	private long salary;
	
	private String workingPeriod;
	
	private String designation;
	

}
