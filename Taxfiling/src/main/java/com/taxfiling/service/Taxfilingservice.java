package com.taxfiling.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taxfiling.dao.Taxfilingdaointerface;
import com.taxfiling.entity.Notice;

@Service
public class Taxfilingservice implements Taxfilingserviceinterface {
@Autowired
Taxfilingdaointerface td;

@Override
public List<Notice> viewadminnotice(String email) {
	
	return td.viewadminnotice(email);
}

@Override
public List<Notice> viewCustomerNotice(Long id) {
	return td.viewCustomerNotice(id);
}

@Override
public List<Notice> viewRepresentativeNotice(Long id) {
	return td.viewRepresentativeNotice(id);
}

@Override
public int addnotice(Notice n) {
	td.save(n);
	return 1;
}
}
