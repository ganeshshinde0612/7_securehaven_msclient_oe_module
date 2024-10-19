package com.securehaven._securehaven_msclient_oe_module.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer_Enquiry {
	
	private int id;
	
	private String firstName;
	
	private String middleName;
	
	private String lastName;

	private int age;
	
	private String gender;

	private String email;

	private String mobileNo;
	
	private String pancard;
	 
	private CibilInfo cibilinfo;

}
