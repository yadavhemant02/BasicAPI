package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.userModel;

public interface userRepository extends JpaRepository<userModel, Integer>{
   
}
