package main.java.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import org.example.model.Order;

public class OrderRepository {

    private final DynamoDBMapper dynamoDBMapper;

    public OrderRepository(DynamoDBMapper dynamoDBMapper) {
        this.dynamoDBMapper = dynamoDBMapper;
    }

    public void saveOrder(Order order) {
        dynamoDBMapper.save(order);
    }

    public Order getOrder(String customerId, String orderId) {
        return dynamoDBMapper.load(Order.class, customerId, orderId);
    }

    public void deleteOrder(String customerId, String orderId) {
        Order order = getOrder(customerId, orderId);
        if (order != null) {
            dynamoDBMapper.delete(order);
        }
    }
}
