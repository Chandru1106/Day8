package com.example.onetomany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.onetomany.demo.employee;
import com.example.onetomany.repository.employeerepo;


@RestController
public class controller {
	@Autowired
	private employeerepo empRepo;
	
	@PostMapping("/employee")
    public ResponseEntity<String> saveEmployees(@RequestBody employee empData) {
        empRepo.save(empData);
        return ResponseEntity.ok("Data saved");
    }
	
	@GetMapping("/showinfo")
	public List<employee> getDetails() {
		return empRepo.findAll();
	}

}
