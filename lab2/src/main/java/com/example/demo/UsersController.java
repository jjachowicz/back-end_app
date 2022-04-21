package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.HashMap;
import java.util.Map;

@Controller
public class UsersController {

    private Map<Integer, UserEntity> users = new HashMap<>();


    @RequestMapping("/users")
    @ResponseBody
    public Object getUsers() {
//
        users.put(1, new UserEntity(1L, "John"));
        users.put(2, new UserEntity(2L, "Mary"));
        users.put(3, new UserEntity(3L, "Kate"));

        return users;

    }

    @RequestMapping("/users/{id}/get")
    @ResponseBody
    public Object getUser(
            @PathVariable Integer id
    ) {
        return users.get(id);
    }

    @RequestMapping("/users/{id}/remove")
    @ResponseBody
    public Object removeUser(
            @PathVariable Integer id
    ) {
        return users.remove(id);
    }

    @RequestMapping("/user/add")
    @ResponseBody
    public Object addUser(
            @RequestParam Integer id,
            @RequestParam String name
    ) {
        return users.put(id, new UserEntity((long)id, name));
    }

//    @RequestMapping("/users/{id}/remove")
//    @ResponseBody
//    public Object getUsers(
//
//    ) {
//        return new UserEntity(3L, "John");
//    }

}
