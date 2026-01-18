package com.store.order;

abstract class Order{
    private int orderId;
    private double amount;
    private OrderStatus status;
}

public Order(int orderId, double amount) { 
    this.orderId = orderId; 
    setAmount(amount); 
    this.status = OrderStatus.PENDING; }

public abstract void processOrder(){
}

public String void getOrderSummary(){
    return  "Order ID: " + orderId + 
            ", Amount: " + amount + 
            ", Status: " + status;
}

public int getOrderId() {
    return orderId; 
} 

public double getAmount() {
     return amount; 
    } 
public OrderStatus getStatus() { 
    return status; 
}

public void setAmount(double amount){
    if (amount >= 0) { this.amount = amount; }
     else { System.out.println("Invalid amount. Must be non-negative.");}
}