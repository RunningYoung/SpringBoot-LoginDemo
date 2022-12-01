package com.fip.springbootlogindemo.controller;

import com.fip.springbootlogindemo.domain.User;
import com.fip.springbootlogindemo.service.UserService;
import com.fip.springbootlogindemo.utils.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
public class LoginController {

    //将Service注入Web层
    @Resource
    UserService userService;

    //实现登录
    @RequestMapping("/login")
    public String show(){
        return "login";
    }
    @RequestMapping(value = "/loginIn",method = RequestMethod.POST)
    public String login(String username,String password){
        User user = userService.loginService(username, password);
        if(user!=null){
            return "redirect:/index.html";
        }else {
            return "error";
        }
    }
    @RequestMapping("/index.html")
    public String mainPage(){
        return "index";
    }
    @RequestMapping("/signup")
    public String disp(){
        return "singup";
    }

    //实现注册功能
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String signUp(String username,String password){
        User user =  userService.signUp(username, password);
        if (user != null){
            return "success";
        } else {
            return "error";
        }

    }

}
