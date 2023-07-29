package com.aira.sp04.order.service;

import com.aira.pojo.Item;
import com.aira.util.JsonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "item-service", fallback = ItemFeignServiceFB.class)
public interface ItemFeignService {
    @GetMapping("/{orderId}")
    JsonResult<List<Item>> getItems(@PathVariable String orderId);

    @GetMapping("/decreaseNumber")
    JsonResult decreaseNumber(@RequestBody List<Item> items);
}
