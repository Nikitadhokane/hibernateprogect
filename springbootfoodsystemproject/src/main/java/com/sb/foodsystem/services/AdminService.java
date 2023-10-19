package com.sb.foodsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.foodsystem.dao.AdminRepository;
import com.sb.foodsystem.entity.Admin;

@Service
public class AdminService {
	
	private AdminRepository adminRepository;
	
	@Autowired
	public AdminService(AdminRepository adminRepository)
	{
		this.adminRepository = adminRepository;
	}
	
	public List<Admin> getAllAdmins()
	{
		return adminRepository.findAll();
	}
	
	public Optional<Admin> getAdminById(Long id)
	{
		return adminRepository.findById(id);
	}
	
	public Admin createAdmin(Admin admin)
	{
		return adminRepository.save(admin);
	}
	
	public Admin updateAdmin(Admin admin)
	{
		return adminRepository.save(admin);
	}
	
	

}
