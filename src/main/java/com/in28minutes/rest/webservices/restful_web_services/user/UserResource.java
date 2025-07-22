package com.in28minutes.rest.webservices.restful_web_services.user;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class UserResource {
    private UserDaoService userDaoService;

    public UserResource(UserDaoService userDaoService) {
        this.userDaoService = userDaoService;
    }

    @GetMapping("/users")
    public List<User> retrieveAllUser() {
        return userDaoService.findAll();
    }

    @GetMapping("/users/{id}")
    public User retrieveUserById(@PathVariable Integer id) {
        return userDaoService.findUserById(id);
    }

    @PostMapping("/users")
    public void postMethodName(@RequestBody User user) {
        userDaoService.saveNewUser(user);
    }

}
