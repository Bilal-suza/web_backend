package com.example.staffLocate.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.staffLocate.Model.User;
import com.example.staffLocate.Repository.UserRepository;


@Service
public class UserService {
 
    @Autowired
    private UserRepository userRepo;

    public User findUserByUsername(String username){
        return userRepo.findByUsername(username);
    }

    public User createUser(User user){
        return userRepo.save(user);
    }

    public void deleteuser(Long user){
        userRepo.deleteById(user);
    } 

}
