package com.cefer.sns.controller;

import com.cefer.sns.entity.User;
import com.cefer.sns.result.Result;
import com.cefer.sns.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("/listUser/{id}")
    public String listUser(@PathVariable int id){
        return userService.listUser(id).toString();
    }

    @PostMapping("/insertUser")
    @ResponseBody
    public Result insertUser(@RequestBody User user){
        Result result = new Result();
        userService.insertUser(user);
        result.setOK("success",user);
        return result;
    }
}
