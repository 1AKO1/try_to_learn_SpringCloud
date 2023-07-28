package com.aira.sp09.service;

import com.aira.pojo.User;
import com.aira.util.JsonResult;
import org.springframework.stereotype.Component;

@Component
public class UserFeignServiceFB implements UserFeignService{
    @Override
    public JsonResult<User> getUser(Integer userId) {
        return JsonResult.err("无法获取用户信息");
    }

    @Override
    public JsonResult addScore(Integer userId, Integer score) {
        return JsonResult.err("无法增加用户积分");
    }
}
