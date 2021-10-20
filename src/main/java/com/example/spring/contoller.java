package com.example.spring;

import com.example.spring.domain.User;
import com.example.spring.repos.LoginRepo;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller

class HelloWorldController {

//     @Autowired
//    private LoginRepo loginRepo;

    @RequestMapping(value = "/greeting")
    public String helloWorldController(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
//    @GetMapping
//    public  String main( Model model){
//        Iterable<User> users = loginRepo.findAll();
//        model.addAttribute("users",users);
//        return "index";
//    }
//    @PostMapping
//    public  String add(@RequestParam String name,@RequestParam String age,Model model){
//        User user=new User(name,age);
//        loginRepo.save(user);
//        model.addAttribute("users",user);
//        return "index";
//    }

}