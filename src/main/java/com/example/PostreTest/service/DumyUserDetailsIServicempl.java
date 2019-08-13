package com.example.PostreTest.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import com.example.PostreTest.model.DumyUserDetails;
import com.example.PostreTest.repository.DumyUserDetailsRepository;

@Service
public class DumyUserDetailsIServicempl implements DumyUserDetailsService{

	@Autowired
	private DumyUserDetailsRepository dudRepo;
	
	@Override
	public Collection<DumyUserDetails> findAll() {
		try {

			Collection<DumyUserDetails> ud =  dudRepo.findAll();
			return ud;	
		}catch(Exception e) {
			System.out.println("Exception in :"+e.getMessage());
		}
		return null;
	}

}
