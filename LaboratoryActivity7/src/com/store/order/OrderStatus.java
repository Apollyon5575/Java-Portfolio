package com.store.order;

private enum OrderStatus{
    PENDING,
    PAID,
    SHIPPED, 
    CANCELLED,
}

abstract class Order{
    private int orderId;
    private double amount;
    private OrderStatus status;
}
