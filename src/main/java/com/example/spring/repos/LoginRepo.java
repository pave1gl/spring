package com.example.spring.repos;

import com.example.spring.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


    public interface LoginRepo extends CrudRepository<User, Integer>{

    List<User> findByLastName(String lastName);

    User findById(long id);

    }
