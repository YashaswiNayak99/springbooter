package com.example.PostreTest.controller;

import org.springframework.http.MediaType;
import java.util.Collection;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.PostreTest.model.DumyUserDetails;
import com.example.PostreTest.service.DumyUserDetailsIServicempl;
import com.example.PostreTest.service.DumyUserDetailsService;

@RestController
public class DumyUserDetailsController {

	@Autowired
	private DumyUserDetailsService udServ;
	
	@RequestMapping(value="/get/users",
			method=RequestMethod.GET, 
					produces=  MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<DumyUserDetails>> getUsers(){
		try {
			
			Collection<DumyUserDetails> ud = udServ.findAll();
			return new ResponseEntity<Collection<DumyUserDetails>>(ud, HttpStatus.OK);
		}catch(Exception e) {
			System.out.println(" Exception in controller : "+ e.getMessage());
		}
		return new ResponseEntity<Collection<DumyUserDetails>>( HttpStatus.NOT_FOUND);
	}
}
