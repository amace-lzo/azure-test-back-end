package com.example.backend.dao;

import com.example.backend.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    List<UserInfo> getAllUser();
}
