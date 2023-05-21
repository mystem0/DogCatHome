package com.sias.controller;

import com.sias.pojo.Pet;
import com.sias.pojo.User;
import com.sias.service.AllService;
import com.sias.service.LoginService;
import com.sias.service.LoginServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/login")

public class loginController {
    @Resource
    private LoginService loginServiceImpl;

    @Resource
    private AllService allService;

    @GetMapping
    public User login(@RequestBody User user){
       return loginServiceImpl.login(user);
    }
    @GetMapping("/all")
    public List<Pet> selectAll(){
        return allService.selectAll();
    }
}
