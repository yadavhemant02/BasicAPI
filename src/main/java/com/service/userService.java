package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.userModel;
import com.repository.userRepository;

@Service
public class userService {
	
	@Autowired
	private userRepository userrepo;

	
	public userModel addData(userModel data) {
		return this.userrepo.save(data);
	}
	
	public ArrayList<userModel> allData(){
		return (ArrayList<userModel>) this.userrepo.findAll();
	}
}
