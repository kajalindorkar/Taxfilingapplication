package com.taxfiling.controller;

import java.util.List;

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
public List<Notice> viewadminnotice(String email)
{
	return ts.viewnoticeadmin(email);
}


@GetMapping("/viewcustomernotice")
public List<Notice> viewCustomerNotice(Long id)
{
	return ts.viewCustomerNotice(id);
}



@GetMapping("/viewRepresentativeNotice")
public List<Notice> viewRepresentativeNotice(Long id)
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
