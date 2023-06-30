package com.aira.service;

import com.aira.pojo.Item;

import java.util.List;

public interface ItemService {
    List<Item> getItems(String orderId);

    void decreaseNumbers(List<Item> list);
}
