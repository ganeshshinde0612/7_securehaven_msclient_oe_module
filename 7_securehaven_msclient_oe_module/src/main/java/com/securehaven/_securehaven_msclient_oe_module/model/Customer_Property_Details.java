package com.securehaven._securehaven_msclient_oe_module.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Customer_Property_Details {

	private int id;
	
	private String propertyType;
	
	private String propertyArea;
	
	private String constructionArea;
	
	private long propertyPrice;
	
	private String propertyAddress;
	

}
