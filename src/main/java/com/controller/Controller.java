package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.userModel;
import com.service.userService;

@RestController
//@RequestMapping("/api")
public class Controller {
	
	@Autowired
	private userService userService;
	
	
	@GetMapping("/")
	public ResponseEntity<String> getdata(){
		return ResponseEntity.ok("good");
	}
	
	@GetMapping("/basic")
	public ResponseEntity<?> getString() {
		return new ResponseEntity<String>("basic api",HttpStatus.OK);
	}
	
	
	@PostMapping("/data")
	public userModel adduserData(@RequestBody userModel data) {
		return this.userService.addData(data);
	}
	
	
	@GetMapping("/data")
	public ArrayList<userModel> alluserData(){
		return this.userService.allData();
	}

}
