package com.example.onetomany.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onetomany.demo.employee;

@Repository

public interface employeerepo extends JpaRepository<employee,Integer> {

}
