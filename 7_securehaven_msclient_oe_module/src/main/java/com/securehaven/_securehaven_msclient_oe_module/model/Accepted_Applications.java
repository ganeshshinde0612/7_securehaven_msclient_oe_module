package com.securehaven._securehaven_msclient_oe_module.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Accepted_Applications {
	
	@Id
	private int id;
	
	private int cibilScore;
	
	private String cibilStatus;

}
