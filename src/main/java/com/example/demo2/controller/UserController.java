package com.example.demo2.controller;

import com.example.demo2.entity.Student;
import com.example.demo2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("student")
    public List<Student> Student() {
        userService.save();
        System.out.println("student controller");
        System.out.printf("%d %d",new Date().getTime(),new java.sql.Date(new Date().getTime()).getTime());
        System.out.println();
        String sql = "select id,name,birth from student";
        var students = jdbcTemplate.query(sql, new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet resultSet, int i) throws SQLException {
                Student student = new Student(resultSet.getInt("id"),
                        resultSet.getString("name"), resultSet.getDate("birth"));
                return student;
            }
        });
        for (Student stu :
                students) {
            System.out.println(stu.getBirth());
        }

        return students;
    }
}
