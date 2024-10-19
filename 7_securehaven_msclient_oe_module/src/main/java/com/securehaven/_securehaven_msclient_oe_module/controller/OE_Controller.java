package com.securehaven._securehaven_msclient_oe_module.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.securehaven._securehaven_msclient_oe_module.model.Accepted_Applications;
import com.securehaven._securehaven_msclient_oe_module.model.CibilInfo;
import com.securehaven._securehaven_msclient_oe_module.model.CibilScore;
import com.securehaven._securehaven_msclient_oe_module.model.Customer_Enquiry;
import com.securehaven._securehaven_msclient_oe_module.model.Customer_Loan_Application;
import com.securehaven._securehaven_msclient_oe_module.model.Inquiry_Id;
import com.securehaven._securehaven_msclient_oe_module.model.Success_Enquiry;
import com.securehaven._securehaven_msclient_oe_module.servicei.Accepted_Application_Servicei;

@CrossOrigin
@RestController
public class OE_Controller {
	
	
	//Change
	@Autowired
	RestTemplate rt;
	
	@Autowired
	Accepted_Application_Servicei asi;
	
	@GetMapping(value = "/get_cibil")
	public ResponseEntity<CibilScore> generate_Customers_Cibil()
	{
		String url="http://localhost:9094/get_cibil_score";
		
		CibilScore cs=rt.getForObject(url, CibilScore.class);
		
		
//		String url2="http://localhost:9090/customer/enquiry/save_cibil/"+eid;
		
//		CibilInfo ci=new CibilInfo();
//		ci.setCibilScore(cs.getCibilScore());
		
//		Success_Enquiry s=rt.postForObject(url2, ci, Success_Enquiry.class);
		
		return new ResponseEntity<CibilScore> (cs, HttpStatus.OK);
	}
	
	
	
	
	
//	@PostMapping(value = "/get_all_inquiries")
//	public ResponseEntity<List<Customer_Enquiry>> getInquiryId()
//	{
//		String url="http://localhost:9095/forward_inquiry";
//		
//		Customer_Enquiry[] ce=rt.postForObject(url, Customer_Enquiry[].class);
//		
//		List<Customer_Enquiry> list=new ArrayList<>(Arrays.asList(ce));
//	
//		return new ResponseEntity<List<Customer_Enquiry>> (list,HttpStatus.OK);
//	}
	
	@GetMapping(value = "/verify_docx")
	public ResponseEntity<Success_Enquiry> verify_Documents()
	{
		Success_Enquiry s=new Success_Enquiry();
		s.setMessage("Documents Verified Successfully !");
	
		return new ResponseEntity<Success_Enquiry> (s,HttpStatus.OK);
	}
	
	@PostMapping(value = "/save_accepted_app")
	public ResponseEntity<Accepted_Applications> saveAccepted(@RequestParam int app_id, @RequestParam String cibilStatus, @RequestParam int cibilScore)
	{
		Accepted_Applications a=new Accepted_Applications();
		a.setId(app_id);
		a.setCibilScore(cibilScore);
		a.setCibilStatus(cibilStatus);
		
		asi.save_Accepted_App(a);
		return new ResponseEntity<Accepted_Applications>(a,HttpStatus.OK);
		
	}

	 
	@GetMapping(value = "/get_accepted_app") 
	public ResponseEntity<List<Customer_Loan_Application>> get_accepted_app()
	{
		List<Accepted_Applications> a=asi.getAcceptedAppl();
	
		
		String url2="http://localhost:9092/forward_loan_form";
		Customer_Loan_Application[] ca=rt.postForObject(url2 ,a,Customer_Loan_Application[].class);
		
		List<Customer_Loan_Application> list=new ArrayList<Customer_Loan_Application>(Arrays.asList(ca));
		
		return new ResponseEntity<List<Customer_Loan_Application>> (list,HttpStatus.OK);
	}
}
