package com.example.store.service;

import com.example.store.model.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final ShoppingCart shoppingCart;

    @Autowired
    public OrderService(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void addItems(List<Integer> itemIds) {
        shoppingCart.addItems(itemIds);
    }

    public List<Integer> getItems() {
        return shoppingCart.getItems();
    }
}
