package com.ittochat.security.demo.controller;

import com.ittochat.security.core.entity.TestUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public TestUser getUser() {
        TestUser testUser = new TestUser();
        testUser.setId(1);
        testUser.setUsername("xiaoming");
        testUser.setPassword("123");
        testUser.setAge(22);
        return testUser;
    }
}
