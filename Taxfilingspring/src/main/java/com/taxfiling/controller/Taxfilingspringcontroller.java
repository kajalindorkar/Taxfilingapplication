package com.taxfiling.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.taxfiling.entity.Notice;
import com.taxfiling.service.Taxfilingspringserviceinterface;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController

public class Taxfilingspringcontroller {
private static final Logger LOGGER = LogManager.getLogger(Taxfilingspringcontroller.class);

@Autowired
Taxfilingspringserviceinterface ts;

@GetMapping("/viewcustomernotices")
public List<Notice> viewCustomerNotice(@PathParam("CustomerId") Long id)
{
	return ts.viewCustomerNotice(id);
}


@GetMapping("/viewrepresentativenotices")
public List<Notice> viewRepresentativeNotice(@PathParam("representativeId") Long id)
{
	return ts.viewCustomerNotice(id);
}


@GetMapping("/viewadminnotices")
public List<Notice> viewAdminNotice(@PathParam("AdminId") String email)
{
	return ts.viewAdminNotice(email);
}
@PostMapping("/addnotices")
public Notice addNotice(@RequestBody Notice n)
{
	return ts.addNotice(n);
	
}
}
