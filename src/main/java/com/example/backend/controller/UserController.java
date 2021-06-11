package com.example.backend.controller;

import com.example.backend.entity.UserInfo;
import com.example.backend.service.UserService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService service;

    private static final ObjectMapper MAPPER = new ObjectMapper();

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping("/allUserInfo")
    public JsonNode getAllUserInfo() {
        List<UserInfo> list = service.getAllUser();
        try {
            String jsonString = MAPPER.writeValueAsString(list);
            return MAPPER.readTree(jsonString);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @GetMapping("/allUserInfoTest")
    public JsonNode allUserInfoTest() {
        List<UserInfo> list = new ArrayList<>();
        list.add(new UserInfo("1", "mike", 20, new Date()));
        list.add(new UserInfo("2", "tom", 21, new Date()));
        try {
            String jsonString = MAPPER.writeValueAsString(list);
            return MAPPER.readTree(jsonString);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
