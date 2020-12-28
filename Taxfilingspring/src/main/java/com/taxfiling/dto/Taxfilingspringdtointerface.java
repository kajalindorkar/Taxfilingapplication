package com.taxfiling.dto;

import java.util.List;
import java.util.Optional;

import com.taxfiling.entity.Customer;
import com.taxfiling.entity.Notice;

public interface Taxfilingspringdtointerface {

public 	List<Notice> viewCustomerNotice(Long id);
public List<Notice> viewRepresentativeNotice(Long id);
public 	List<Notice> viewAdminNotice(String  email);
public Notice addNotice(Notice n);

}
