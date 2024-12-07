package com.klef.jfsd.exam.repository;

import com.klef.jfsd.exam.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
