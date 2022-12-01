package com.fip.springbootlogindemo.repository;

import com.fip.springbootlogindemo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
    User findByUname(String uname);
    User findByUnameAndPassword(String uname, String password);
}
