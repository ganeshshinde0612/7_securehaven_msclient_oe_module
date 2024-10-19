package com.securehaven._securehaven_msclient_oe_module.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Customer_Loan_Application {
	

	private int id;
	
	private String email;
	
	
	private Customer_Info customerinfo;
	
    private	Customer_Family_Details customerfamilydetails;
    
    private Customer_Address customeraddress;
    
    private Educational_Details educationaldetails;
  
    private Customer_Profession customerprofession;
    
    private Customer_Mortgage customermortgage;
    
    private Customer_Account_Details customeraccountdetails;
	
	private Customer_Previous_Loan customerpreviousloan;
	
	private Customer_Property_Details customerpropertydetails;
	
	private Customer_Documents customerdocx;
	
}
