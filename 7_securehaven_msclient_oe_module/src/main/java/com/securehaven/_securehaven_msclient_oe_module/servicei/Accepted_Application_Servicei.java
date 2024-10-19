package com.securehaven._securehaven_msclient_oe_module.servicei;

import java.util.List;

import com.securehaven._securehaven_msclient_oe_module.model.Accepted_Applications;

public interface Accepted_Application_Servicei {

	public void save_Accepted_App(Accepted_Applications a);

	public List<Accepted_Applications> getAcceptedAppl();

}
