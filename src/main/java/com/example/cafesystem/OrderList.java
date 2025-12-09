package com.example.cafesystem;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class OrderList {
    private List<Order> orders;

    public  OrderList() {
        orders = new ArrayList<>();
    }

    public void addOrder(Order order){
        orders.add(order);
    }

    public int getOrderCount(){
        return orders.size();
    }
}
