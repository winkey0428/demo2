package com.example.demo2.service;

import com.example.demo2.dao.UserDao;
import com.example.demo2.dao.UserDaoImp;
import com.example.demo2.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Value("driver_string")
    private String driver;
    //@Autowired
    @Resource(name = "userDao")
    private UserDao userDao;

/*    @Autowired
    private JdbcTemplate jdbcTemplate;*/

    @Override
    public void save() {

        System.out.printf("hello"+driver);
        userDao.save();
    }
}
