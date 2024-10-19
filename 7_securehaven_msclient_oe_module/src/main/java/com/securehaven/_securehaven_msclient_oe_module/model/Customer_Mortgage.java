package com.securehaven._securehaven_msclient_oe_module.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Customer_Mortgage {

	private int id;
	
	private double propertyValue;
	
	private String propertyType;
	
	private double loanOnProperty; 
}
