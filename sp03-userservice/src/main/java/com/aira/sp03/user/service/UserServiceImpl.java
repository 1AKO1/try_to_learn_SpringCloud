package com.aira.sp03.user.service;

import com.aira.pojo.User;
import com.aira.service.UserService;
import com.aira.util.JsonUtil;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import java.util.List;

@RefreshScope
@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Value("${sp.user-service.users}")
    private String userJson;

    @Override
    public User getUser(Integer id) {
        log.info("users json string: " + userJson);
        List<User> list = JsonUtil.from(userJson, new TypeReference<List<User>>() {});
        for (User user : list) {
            if(user.getId().equals(id)){
                return user;
            }
        }
        return new User(id, "name-" + id, "pwd-" + id);
    }

    @Override
    public void addScore(Integer id, Integer score) {
        log.info("user " + id +  " - 增加积分 " + score);
    }
}
