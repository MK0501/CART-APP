package com.x.Service;

import com.x.Model.User;
import com.x.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public void addUser(User m){
        userRepository.save(m);
    }
    public List<User> getUser(){
        List<User> list =new ArrayList<User>();
        userRepository.findAll().forEach(user1 -> list.add(user1));
        return list;
    }
}
