package com.greenstetch.assignment.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.greenstetch.assignment.entity.User;
@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
	
	@Query("select t from User t where username=:name and password=:pass")
	User getDataByNamePass(String name,String pass);

}
