package com.sky.bean;

import java.util.List;

/**
 * Created by Jo on 24/09/2015.
 */
public interface Customer {

    //logged in
    //guest

    //returns a list of the customers orders
    List<Order> getOrders();

    void addOrder(Order order);
}
