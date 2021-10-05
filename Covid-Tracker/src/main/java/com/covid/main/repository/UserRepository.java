package com.covid.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.covid.main.dao.UserDetailsDAO;

@Repository
public interface UserRepository extends JpaRepository<UserDetailsDAO, Integer>  {

	
}
