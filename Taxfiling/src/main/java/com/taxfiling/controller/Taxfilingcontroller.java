package com.taxfiling.controller;

import java.util.ArrayList;
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
	List<Notice> ll=ts.viewadminnotice(email_n);
	List<Notice> ll1=new ArrayList<Notice>();
	for(Notice n:ll)
	{
		Notice n1=new Notice();
	   n1.setNoticeBody(n.getNoticeBody());
	   n1.setNoticeId(n.getNoticeId());
	   ll1.add(n1);
	 }
return ll1;
}


@GetMapping("/viewcustomernotice")
public List<Notice> viewCustomerNotice(@PathParam("customer_id") Long id)
{
	List<Notice> ll=ts.viewCustomerNotice(id);
	List<Notice> ll1=new ArrayList<Notice>();
	for(Notice n:ll)
	{
		Notice n1=new Notice();
	   n1.setNoticeBody(n.getNoticeBody());
	   n1.setNoticeId(n.getNoticeId());
	   ll1.add(n1);
	 }
return ll1;
}



@GetMapping("/viewRepresentativeNotice")
public List<Notice> viewRepresentativeNotice(@PathParam("representative_id") Long id)
{
	List<Notice> ll=ts.viewRepresentativeNotice(id);
	List<Notice> ll1=new ArrayList<Notice>();
	for(Notice n:ll)
	{
		Notice n1=new Notice();
	   n1.setNoticeBody(n.getNoticeBody());
	   n1.setNoticeId(n.getNoticeId());
	   ll1.add(n1);
	 }
return ll1;
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
