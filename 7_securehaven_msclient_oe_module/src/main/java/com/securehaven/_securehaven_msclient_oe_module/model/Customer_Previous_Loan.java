package com.securehaven._securehaven_msclient_oe_module.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Customer_Previous_Loan {
	

	private int id;
	
	private long loanAmount;
	
	private long paidAmount;
	
	private long remainingAmount;
	
	private String loanStatus;
	
	private String ifscCode;
	
	private String bankName;
	

}
