package com.covid.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.covid.main.model.AdminRegisterResponse;
import com.covid.main.model.RegisterResponse;
import com.covid.main.model.RiskResponse;
import com.covid.main.model.UserCovidInfo;
import com.covid.main.model.UserDetails;
import com.covid.main.service.AdminService;
import com.covid.main.service.UserService;

@RestController
public class UserController{
	
	@Autowired
	UserService userService;
	
	@Autowired
	AdminService adminService;
	
    @PostMapping("/"+"registerUser")
	public RegisterResponse registerUser(@RequestBody UserDetails userDetails) {
    	int id =userService.saveUser(userDetails);
    	
    	RegisterResponse response=new RegisterResponse(id);
		return response;	
	}
    
    @PostMapping("/userRisk")
   	public RiskResponse getRisk(@RequestBody UserCovidInfo userCovidInfo) {
       	
    	int risk=userService.getRisk(userCovidInfo);
    	RiskResponse response = new RiskResponse(risk);
   		return response;	
   	}
    
    
    @PostMapping("/registerAdmin")
   	public AdminRegisterResponse registerAdmin(@RequestBody UserDetails userDetails) {
       	int id =adminService.saveUser(userDetails);
       	
       	AdminRegisterResponse response=new AdminRegisterResponse(id);
   		return response;	
   	}

}
