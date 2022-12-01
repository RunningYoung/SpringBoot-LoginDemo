//package com.fip.springbootlogindemo.controller;
//
//import com.fip.springbootlogindemo.domain.User;
//import com.fip.springbootlogindemo.service.UserService;
//import com.fip.springbootlogindemo.utils.Result;
//import org.springframework.web.bind.annotation.*;
//
//import javax.annotation.Resource;
//
//@RestController
//@RequestMapping("/user")
//public class UserController {
//    @Resource
//    private UserService userService;
//    @PostMapping("/login")
//    public Result<User> loginController(@RequestParam String uname, @RequestParam String password) {
//        User user = userService.loginService(uname, password);
//        if (user != null) {
//            return Result.success(user,"登录成功");
//        } else {
//            return Result.error("123","账号或者密码错误！");
//        }
//    }
//
//    @PostMapping("/register")
//    public Result<User> registController(@RequestBody User newUser){
//        User user = userService.registService(newUser);
//        if (user!= null) {
//            return Result.success(user,"注册成功");
//        } else {
//            return Result.error("456","用户已存在！");
//        }
//    }
//}
