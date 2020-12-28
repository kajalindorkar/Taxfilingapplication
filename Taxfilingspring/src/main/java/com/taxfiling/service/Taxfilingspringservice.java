package com.taxfiling.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.taxfiling.dto.Taxfilingspringdtointerface;
import com.taxfiling.entity.Customer;
import com.taxfiling.entity.Notice;

@Configuration
public class Taxfilingspringservice implements Taxfilingspringserviceinterface{
@Autowired
Taxfilingspringdtointerface td;

@Override
public List<Notice> viewCustomerNotice(Long id) {
	return td.viewCustomerNotice(id);
}

@Override
public List<Notice> viewRepresentativeNotice(Long id) {
	return td.viewRepresentativeNotice(id);
}

@Override
public List<Notice> viewAdminNotice(String email) {
	return td.viewAdminNotice(email);
}

@Override
public Notice addNotice(Notice n) {
	return td.addNotice(n);
}



}
