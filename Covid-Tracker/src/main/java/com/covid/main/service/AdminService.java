package com.covid.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid.main.dao.AdminDetailsDAO;
import com.covid.main.model.UserDetails;
import com.covid.main.repository.AdminRepository;

@Service
public class AdminService {

	@Autowired
	AdminRepository adminRepo;
	
public int saveUser(UserDetails details) {
		
		AdminDetailsDAO user=new AdminDetailsDAO();
		user.setName(details.getName());
		user.setMobile(details.getMobileNumber());
		user.setPincode(details.getPincode());
		
		AdminDetailsDAO response=adminRepo.save(user);
		return response.getId();
	}
	
}
