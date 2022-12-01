package com.fip.springbootlogindemo.service.serviceImpl;

import com.fip.springbootlogindemo.domain.User;
import com.fip.springbootlogindemo.repository.UserDao;
import com.fip.springbootlogindemo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;
    @Override
    public User loginService(String username, String password) {
        User user = userDao.findByUnameAndPassword(username, password);
        if (user != null) {
            user.setPassword("");
        }
        return user;
    }

    @Override
    public User registService(User user) {
        if (userDao.findByUname(user.getUname()) != null) {
            return null;
        } else {
            User newUser = userDao.save(user);
            if (newUser != null) {
                newUser.setPassword("");
            }
            return newUser;
        }
    }

    @Override
    public User signUp(String username, String password) {
        if (userDao.findByUname(username) != null){
            return null;
        } else {
            User user = new User();
            user.setUname(username);
            user.setPassword(password);
            userDao.save(user);
            return user;
        }
    }
}
