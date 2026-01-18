package com.store.main

import com.store.order.*;
import java.util.ArrayList;
import java.util.Iterator;

public class OrderApp{
    public static void main(String[] args) {
        ArrayList<Order> orders = new ArrayList<>();

        OnlineOrder order1 = new OnlineOrder (101, 500.0, "PENDING");
        OnlineOrder order2 = new OnlineOrder (102, 200.0, "PENDING");
        OnlineOrder order3 = new OnlineOrder (103, 290.0, "PENDING");


        orders.add(order1); 
        orders.add(order2); 
        orders.add(order3);

        order1.processOrder();
         order1.pay(); 

        order2.processOrder(); 
        order2.pay();

        order3.processOrder(); 
        order3.pay();

        Iterator<Order> iterator = orders.iterator(); 
        while (iterator.hasNext()) {
             Order order = iterator.next(); 
             System.out.println(order.getOrderSummary());
              if (order.getStatus() == OrderStatus.CANCELLED)  { 
                  System.out.println("Removing cancelled order: " + order.getOrderId()); iterator.remove(); 
                } 
            }
        
    System.out.println("\nRemaining Orders:"); 
    for (Order order : orders){ 
        System.out.println(order.getOrderSummary());
    }
}
}
    