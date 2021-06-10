package com.example.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {

    @RequestMapping("/allRole")
    public List<String> getAllRole(){
        List<String> list = new ArrayList<>();
        list.add("管理员");
        list.add("超级管理员");
        return list;
    }
}
