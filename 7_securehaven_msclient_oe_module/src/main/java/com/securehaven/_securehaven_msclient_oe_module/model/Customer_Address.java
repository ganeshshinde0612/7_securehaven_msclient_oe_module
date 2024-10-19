package com.securehaven._securehaven_msclient_oe_module.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Customer_Address {
	
	private int id;
	
	private int houseNo;
	
	private String areaName;
	
	private String cityName;
	
	private String district;
	
	private String state;
	
	private int pincode;
	
	

}
