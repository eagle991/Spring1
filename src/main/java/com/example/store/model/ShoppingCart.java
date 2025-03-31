package com.example.store.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ShoppingCart {
    private final List<Integer> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItems(List<Integer> itemIds) {
        items.addAll(itemIds);
    }

    public List<Integer> getItems() {
        return new ArrayList<>(items);
    }
}