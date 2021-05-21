package com.mdits.controller;


import com.mdits.exception.ResourceNotFoundException;
import com.mdits.model.Department;
import com.mdits.repository.DepartmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class DepartmentController {
		
		@Autowired
		private DepartmentRepository departmentRepository;
		
		
		@GetMapping("/departments")
		public List<Department> getAllDepartments(){
			
		return departmentRepository.findAll();
		}

		@GetMapping("/departments/{dNumber}")
		    public ResponseEntity<Department> getDepartmentById(@PathVariable(value = "dNumber") Integer dNumber)
		        throws ResourceNotFoundException {
		        Department department = departmentRepository.findById(dNumber)
		        .orElseThrow(() -> new ResourceNotFoundException("Department not found for this id :: " + dNumber));
		        return ResponseEntity.ok().body(department);
		    }
		
		  @PostMapping("/departments") 
		  public Department createDepartment(@RequestBody Department department) { 
			  return departmentRepository.save(department); }
		 
		  @PutMapping("/departments/{dNumber}") 
		  public ResponseEntity<Department> updateDepartment(@PathVariable(value = "dNumber") Integer dNumber,
				  @Valid @RequestBody Department departmentDetails) throws
		  ResourceNotFoundException {
			  Department department = departmentRepository.findById(dNumber)
					  .orElseThrow(() -> new
				  ResourceNotFoundException("Department not found for this id :: " +
						  dNumber));

		  final Department updatedDepartment = departmentRepository.save(department); 
		  return  ResponseEntity.ok(updatedDepartment); 
		  }

	    @DeleteMapping("/departments/{dNumber}")
	    public Map<String, Boolean> deleteDepartment(@PathVariable(value = "dNumber") Integer dNumber)
	        throws ResourceNotFoundException {
	        Department department = departmentRepository.findById(dNumber)
	        .orElseThrow(() -> new ResourceNotFoundException("Department not found for this id :: " + dNumber));

	       departmentRepository.delete(department);
	       Map<String, Boolean> response = new HashMap<>();
	       response.put("deleted", Boolean.TRUE);
	       return response;
	    }
	}
