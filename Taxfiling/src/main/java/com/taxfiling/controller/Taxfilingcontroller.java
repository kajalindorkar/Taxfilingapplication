package com.taxfiling.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.taxfiling.entity.Notice;
import com.taxfiling.service.Taxfilingserviceinterface;

@RestController
public class Taxfilingcontroller  {
@Autowired
Taxfilingserviceinterface ts;

@GetMapping("/viewadminnotice")
public List<Notice> viewadminnotice(@PathParam("email_n") String email_n)
{
	return ts.viewadminnotice(email_n);
}


@GetMapping("/viewcustomernotice")
public List<Notice> viewCustomerNotice(@PathParam("customer_id") Long id)
{
	return ts.viewCustomerNotice(id);
}



@GetMapping("/viewRepresentativeNotice")
public List<Notice> viewRepresentativeNotice(@PathParam("representative_id") Long id)
{
	return ts.viewRepresentativeNotice(id);
}



@PostMapping("/addnotice")
public String addnotice(@RequestBody Notice n) {
	String str="Registration unsuccessful";
	int i=ts.addnotice(n);
	if(i>0) {
		str="Notice  is sent";
	}
	 
	return str;
}
}
