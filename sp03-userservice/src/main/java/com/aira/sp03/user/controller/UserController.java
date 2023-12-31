package com.aira.sp03.user.controller;


import com.aira.pojo.User;
import com.aira.service.UserService;
import com.aira.util.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{userId}")
    public JsonResult<User> getUser(@PathVariable Integer userId){
        log.info("get user, userId = " + userId);
        User user = userService.getUser(userId);
        return JsonResult.ok(user);
    }

    @GetMapping("/{userId}/score")
    public JsonResult addScore(@PathVariable Integer userId, Integer score){
        userService.addScore(userId, score);
        return JsonResult.ok();
    }
}
