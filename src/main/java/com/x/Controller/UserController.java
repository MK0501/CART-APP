package com.x.Controller;

import com.x.Model.User;
import com.x.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/cart")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/newuser")
    public void newuser(@RequestBody User userObj){
        userService.addUser(userObj);
    }
    @GetMapping("/user")
    public List<User> getUser(){
        return userService.getUser();
    }

}
