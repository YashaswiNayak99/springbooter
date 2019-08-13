package com.example.PostreTest.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.example.PostreTest.model.DumyUserDetails;

@Service
public interface DumyUserDetailsService {

	Collection<DumyUserDetails> findAll();
}
