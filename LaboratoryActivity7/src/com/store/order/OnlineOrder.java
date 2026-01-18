package com.store.order;
import com.store.payment.Payable;

public class OnlineOrder extends Order implements Payable{
    public OnlineOrder(int orderId, double amount, String status, ) 
    { super(orderId, amount, status); }
}

@Override 
public abstract void processOrder(){
    System.out.println("Your order is now being processed");
}

@Override
public void pay(){
    System.out.println("Your order has been paid");
    setStatus(OrderStatus.PAID);
}