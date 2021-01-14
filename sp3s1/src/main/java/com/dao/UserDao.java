package com.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.UserInfo;

@Repository
public interface UserDao extends CrudRepository<UserInfo, Integer>{

}
