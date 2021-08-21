package com.webperside.webmallappv2.controller;

import com.webperside.webmallappv2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/index")
public class TestController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public String index(){
        return "index";
    }

    @GetMapping("/v2")
    public ModelAndView indexV2(ModelAndView modelAndView){

        modelAndView.addObject("users",userRepository.findAll());

        modelAndView.setViewName("indexv2");
        return modelAndView;
    }

    // localhost:8080/index/v2

}