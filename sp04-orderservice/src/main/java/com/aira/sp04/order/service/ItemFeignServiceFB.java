package com.aira.sp04.order.service;

import com.aira.pojo.Item;
import com.aira.util.JsonResult;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class ItemFeignServiceFB implements ItemFeignService{

    @Override
    public JsonResult<List<Item>> getItems(String orderId) {
        if(Math.random() < 0.5){
            return JsonResult.ok().data(

                    Arrays.asList(
                            new Item(1, "缓存aaa", 2),
                            new Item(2, "缓存bbb", 1),
                            new Item(3, "缓存ccc", 5),
                            new Item(4, "缓存ddd", 6),
                            new Item(5, "缓存eee", 4)
                    )
            );
        }else{
            return JsonResult.err("无法获取订单商品列表");
        }
    }

    @Override
    public JsonResult decreaseNumber(List<Item> items) {
        return JsonResult.err("无法修改商品库存");
    }
}
