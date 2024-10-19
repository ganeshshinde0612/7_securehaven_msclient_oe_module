package com.securehaven._securehaven_msclient_oe_module.model;

import java.text.SimpleDateFormat;
import java.util.Date;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CibilInfo {
	
	private int id;
	private int cibilScore;
	private Date cibilDate;
	
}
