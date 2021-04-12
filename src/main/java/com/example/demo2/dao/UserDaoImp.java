package com.example.demo2.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImp implements UserDao {

    @Override
    public void save() {
        System.out.println("userdaoimp save");
    }
}
