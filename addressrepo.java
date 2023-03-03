package com.example.onetomany.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onetomany.demo.address;

@Repository
public interface addressrepo extends JpaRepository<address,Integer>{

}

