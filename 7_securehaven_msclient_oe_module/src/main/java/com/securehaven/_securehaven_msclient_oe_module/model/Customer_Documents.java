package com.securehaven._securehaven_msclient_oe_module.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Customer_Documents {
	
	private int id;
	
	private byte[] pancard;
	
	private byte[] aadhar;
	
	private byte[] salarySlips;
	
	private byte[] incomeTaxReturn;
	
	private byte[] photo;
	
	private byte[] signature;
	
	private byte[] propertyProof;
	

}
