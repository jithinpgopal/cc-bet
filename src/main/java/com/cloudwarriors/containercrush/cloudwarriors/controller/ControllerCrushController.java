package com.cloudwarriors.containercrush.cloudwarriors.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerCrushController {
	@GetMapping(value = "/status", produces = "text/plain")
	public String homePage() {
		String success="worked successfully";
		 
		return success;
	}  
	}  

