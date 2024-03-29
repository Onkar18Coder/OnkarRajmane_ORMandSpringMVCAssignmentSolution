package com.customermanager.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customermanager.entity.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer>{

}