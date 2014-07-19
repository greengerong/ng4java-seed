package com.github.greengerong.repository;

import com.github.greengerong.domain.Order;

import java.util.List;

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
public interface OrderRepository {
    List<Order> getAll();
}
