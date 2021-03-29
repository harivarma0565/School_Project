package com.example.schools.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.schools.Services.SchoolDetailsService;
import com.example.schools.Utils.Response;
import com.example.schools.VO.SchoolDetailsVO;

@CrossOrigin
@RestController
@RequestMapping("/SchoolDetails")
public class SchoolDetailsController {
	// Controller 
	@Autowired
	SchoolDetailsService service;
	
	@PostMapping(value="/Test")
	public Response<?> saveTesting(@RequestBody SchoolDetailsVO vo){
		String result =service.saveData(vo);
		return new Response<>(true, HttpStatus.ACCEPTED, result);
	}
	


}
