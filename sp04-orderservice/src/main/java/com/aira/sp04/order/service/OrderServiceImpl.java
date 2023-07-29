package com.aira.sp04.order.service;

import com.aira.pojo.Item;
import com.aira.pojo.Order;
import com.aira.pojo.User;
import com.aira.service.OrderService;
import com.aira.util.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private ItemFeignService itemService;
    @Autowired
    private UserFeignService userService;
    @Override
    public Order getOrder(String orderId) {
        //调用user-service获取用户信息
        JsonResult<User> user = userService.getUser(7);
        JsonResult<List<Item>> items = itemService.getItems(orderId);
        Order order = new Order();
        order.setId(orderId);
        order.setUser(user.getData());
        order.setItems(items.getData());
        return order;
    }

    @Override
    public void addOrder(Order order)
    {
        userService.addScore(7, 100);
        log.info("save order: " + order);
    }
}
