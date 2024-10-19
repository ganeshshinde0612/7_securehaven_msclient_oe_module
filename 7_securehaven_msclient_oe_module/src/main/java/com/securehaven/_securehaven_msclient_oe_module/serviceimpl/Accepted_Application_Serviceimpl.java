package com.securehaven._securehaven_msclient_oe_module.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.securehaven._securehaven_msclient_oe_module.model.Accepted_Applications;
import com.securehaven._securehaven_msclient_oe_module.repository.Accepted_Application_Repository;
import com.securehaven._securehaven_msclient_oe_module.servicei.Accepted_Application_Servicei;

@Service
public class Accepted_Application_Serviceimpl implements Accepted_Application_Servicei{


	@Autowired
	Accepted_Application_Repository ar;
	
	@Override
	public void save_Accepted_App(Accepted_Applications a) {
		ar.save(a);
		
	}

	@Override
	public List<Accepted_Applications> getAcceptedAppl() {
		// TODO Auto-generated method stub
		return ar.findAll();
	}

	
}
