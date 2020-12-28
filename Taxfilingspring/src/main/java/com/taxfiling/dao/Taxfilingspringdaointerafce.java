package com.taxfiling.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.taxfiling.entity.Admin;
import com.taxfiling.entity.Customer;
import com.taxfiling.entity.Notice;
import com.taxfiling.entity.Representative;

@Repository
public interface Taxfilingspringdaointerafce extends JpaRepository<Notice, Long>
{
	
	@Query("select t from Notice t INNER JOIN t.customer c where c.customerId=:id")
	public List<Notice> viewCustomerNotice(Long id);
     
	@Query("select t from Notice t INNER JOIN t.representative_n c where c.representativeId=:id")
	public List<Notice> viewRepresentativeNotice(Long id);
	
	@Query("select n from Notice n where n.admin_n=:email")
    public List<Notice> viewAdminNotice(String email);
    
	
	
}
