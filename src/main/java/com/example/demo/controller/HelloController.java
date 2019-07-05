package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String index(String name){
        User user = userService.findByUserName(name);
        logger.info("用户名为:{}", name);
        return "hello : " + user.getUsername();
    }
}
