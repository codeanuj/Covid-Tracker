package com.covid.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid.main.dao.UserDetailsDAO;
import com.covid.main.model.UserCovidInfo;
import com.covid.main.model.UserDetails;
import com.covid.main.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepo;
	
	public int saveUser(UserDetails details) {
		
		UserDetailsDAO user=new UserDetailsDAO();
		user.setName(details.getName());
		user.setMobile(details.getMobileNumber());
		user.setPincode(details.getPincode());
		
		UserDetailsDAO response=userRepo.save(user);
		return response.getId();
	}
	
	
	
    public int getRisk(UserCovidInfo info) {
		int risk=0;
		
		if(info.getSymptoms().size()==0 && !info.isTravelHistory() && !info.isContactWithCovidPatient()) {
			risk=5;
		}else if(info.getSymptoms().size()==1 && (info.isTravelHistory() || info.isContactWithCovidPatient())) {
			risk=50;
		}else if(info.getSymptoms().size()==2 && (info.isTravelHistory() || info.isContactWithCovidPatient())) {
			risk=75;
		}else {
			risk=95;
		}
		return risk;
	
	}
}
