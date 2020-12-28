package com.taxfiling.dto;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.taxfiling.entity.Customer;
import com.taxfiling.entity.Notice;



@Configuration
public class Taxfilingspringdto implements Taxfilingspringdtointerface{
@Autowired
Taxfilingspringdtointerface tf;

@Override
public List<Notice> viewCustomerNotice(Long id) {
	
	return tf.viewCustomerNotice(id);
}

@Override
public List<Notice> viewRepresentativeNotice(Long id) {
	return tf.viewRepresentativeNotice(id);
}

@Override
public List<Notice> viewAdminNotice(String  email) {
	return tf.viewAdminNotice(email);
	}

}
