package com.lviv.igor.controller;

import com.lviv.igor.model.User;
import com.lviv.igor.service.UserService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HellowWorldContoller {

    @Autowired
    UserService userService;
    
    @RequestMapping("/users/1")
    public ModelAndView go(){
        ModelAndView mv = new ModelAndView("hello");
        User user = userService.getUserById(1);
        mv.addObject("user", user);
        return mv;
    }
}
