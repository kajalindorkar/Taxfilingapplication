package com.taxfiling.service;

import java.util.List;

import com.taxfiling.entity.Notice;

public interface Taxfilingserviceinterface {
public List<Notice> viewnoticeadmin(String email);
public List<Notice> viewCustomerNotice(Long id);
public List<Notice> viewRepresentativeNotice(Long id);
public int addnotice(Notice n);

}
