package com.abhirampjayan.storemvn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreMvnApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StoreMvnApplication.class, args);
        OrderService orderService = context.getBean(OrderService.class);
        orderService.placeOrder();
    }
}
