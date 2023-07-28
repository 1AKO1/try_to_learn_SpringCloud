package com.aira.sp09.service;

import com.aira.pojo.Item;
import com.aira.util.JsonResult;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ItemFeignServiceFB implements ItemFeignService {
    @Override
    public JsonResult<List<Item>> getItems(String orderId) {
        return JsonResult.err("无法获取订单商品列表");
    }

    @Override
    public JsonResult decreaseNumber(List<Item> items) {
        return JsonResult.err("无法修改商品库存");
    }
}
