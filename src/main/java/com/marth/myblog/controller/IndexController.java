package com.marth.myblog.controller;

import com.marth.myblog.service.IUserService;
import com.marth.myblog.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
@RequestMapping("/index")
public class IndexController {
    @Autowired
    private IUserService userService;
    @GetMapping("/s")
    public String index(){
        return "ok";
    }
    @GetMapping("/{id}")
    public Object object(@PathVariable("id")String id){
        return userService.getById(id)+"1";
    }
}
