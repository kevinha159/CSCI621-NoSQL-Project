package main.java.service;

import org.example.model.Order;
import org.example.repository.OrderRepository;

public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order placeOrder(Order order) {
        orderRepository.saveOrder(order);
        return order;
    }

    public Order getOrder(String customerId, String orderId) {
        return orderRepository.getOrder(customerId, orderId);
    }

    public void cancelOrder(String customerId, String orderId) {
        orderRepository.deleteOrder(customerId, orderId);
    }
}
