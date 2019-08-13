package com.example.PostreTest.repository;

import java.util.Collection;
import com.example.PostreTest.model.*;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.core.CrudMethods;
import org.springframework.stereotype.Repository;

@Repository
public interface DumyUserDetailsRepository extends CrudRepository<DumyUserDetails, Long> {

	Collection<DumyUserDetails> findAll();
}
