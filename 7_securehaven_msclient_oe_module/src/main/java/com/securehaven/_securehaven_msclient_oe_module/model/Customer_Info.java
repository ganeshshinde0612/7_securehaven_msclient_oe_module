package com.securehaven._securehaven_msclient_oe_module.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Customer_Info {

	
	private int id;
	
	private String firstName;
	
	private String middleName;
	    
	private String lastName;
	    
	private byte age;
	    
	private String gender;
	    
	private String dob;
	
	private String mobileNo;
	
	private String email;

	private String username;
	 
	private String password;

	private String aadhar;
	
	private String pancard;
	
	private String maritalStatus;
	
	private long totalloanrequired;
}
