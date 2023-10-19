package com.sb.foodsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.foodsystem.entity.Admin;
import com.sb.foodsystem.services.AdminService;

@RestController
@RequestMapping("/admins")
public class AdminController {
	
	private AdminService adminService;
	
	@Autowired
	public AdminController(AdminService adminService)
	{
		this.adminService = adminService;
	}
	
	@GetMapping
	public ResponseEntity<List<Admin>> getAllAdmins()
	{
		return ResponseEntity.ok(adminService.getAllAdmins());
	}
	
	@GetMapping("{/id")
	public ResponseEntity<Admin> getAdminById(@PathVariable Long id)
	{
		return adminService.getAdminById(id).map(admin-> new ResponseEntity<>(admin, HttpStatus.OK))
				.orElseGet(()-> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	
	@PostMapping
	public ResponseEntity<Admin>createAdmin(@RequestBody Admin admin)
	{
		Admin createdAdmin=adminService.createAdmin(admin);
		return new ResponseEntity<>(createdAdmin, HttpStatus.CREATED);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Admin> updateAdmin(@PathVariable Long id, @RequestBody Admin admin)
	{
		if(!adminService.getAdminById(id).isPresent())
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		admin.setId(id);
		Admin updatedAdmin = adminService.updateAdmin(admin);
		return new ResponseEntity<>(updatedAdmin, HttpStatus.OK);
	}
	
	
	
	
	
	

}
