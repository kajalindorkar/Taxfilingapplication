package com.taxfiling.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.taxfiling.entity.Notice;

@Repository
public interface Taxfilingdaointerface extends JpaRepository<Notice, Long>{
	
	//public List<Notice> viewnoticeadmin(Notice n);
	@Query("select n from Notice n where n.admin_n.email=:email")
    public List<Notice> viewadminnotice(String email);
	

	@Query("select t from Notice t INNER JOIN t.customer c where c.customerId=:id")
	public List<Notice> viewCustomerNotice(Long id);
     
	@Query("select t from Notice t INNER JOIN t.representative_n c where c.representativeId=:id")
	public List<Notice> viewRepresentativeNotice(Long id);
	

//	@Query("update Notice t set t.noticeBody=:tot  where t.customerId=:id")
//	public int addnotice(Notice n);
}
