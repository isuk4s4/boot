package com.example.demo.service;


import javax.transaction.Transactional;

import com.example.demo.DTO.userDTO;
import com.example.demo.REPO.userREPO;
import com.example.demo.entity.user;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class userService {
 @Autowired
public ModelMapper modelMapper;

@Autowired
public userREPO userREPO;

//add user
public user addUser(userDTO userDTO){
user adduser =  userREPO.save(modelMapper.map(userDTO, user.class));
return adduser;

}
//delete user
public void deleteUser(Long Id){
     userREPO.deleteById(Id);

}
//update user
public user updateUser(userDTO userDTO){
user upDate__user = userREPO.save(modelMapper.map(userDTO,user.class));
return upDate__user;

}
//all user function

public List<user> allUser(){

     return userREPO.findAll();

}
//findUserByid
    public List<user> findUserById(Long id){

        return userREPO.findAllById(id);


    }


}
