package com.github.greengerong.repository;


import com.github.greengerong.domain.Order;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.google.common.collect.ImmutableList.of;

/**
 * ***************************************
 * *
 * Auth: green gerong                     *
 * Date: 2014                             *
 * blog: http://greengerong.github.io/    *
 * github: https://github.com/greengerong *
 * *
 * ****************************************
 */
@Service
public class OrderRepositoryImpl implements OrderRepository {

    @Override
    public List<Order> getAll() {
        return allOrders();
    }

    private List<Order> allOrders() {
        return of(
                createOrder("order1"),
                createOrder("order2"),
                createOrder("order2")
        );
    }

    private Order createOrder(String name) {
        return new Order(name);
    }
}
