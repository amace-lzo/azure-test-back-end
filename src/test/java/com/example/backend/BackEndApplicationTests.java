package com.example.backend;

import com.example.backend.entity.UserInfo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class BackEndApplicationTests {

    @Test
    void contextLoads() {
        ObjectMapper objectMapper = new ObjectMapper();
        List<UserInfo> list = new ArrayList<>();
        list.add(new UserInfo("1", "mike", 20, new Date()));
        list.add(new UserInfo("2", "tom", 21, new Date()));
        try {
            String jsonString = objectMapper.writeValueAsString(list);
            System.out.println(jsonString);
            JsonNode jsonNode = objectMapper.readTree(jsonString);
            System.out.println(jsonNode.textValue());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }

}
