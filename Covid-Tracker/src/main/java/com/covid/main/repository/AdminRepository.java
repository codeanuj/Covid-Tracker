package com.covid.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covid.main.dao.AdminDetailsDAO;

public interface AdminRepository extends JpaRepository<AdminDetailsDAO, Integer>{

}
