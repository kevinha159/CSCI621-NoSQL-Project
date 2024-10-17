package main.java.models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

/*
 * Model class to represent Order table
 * This class is used to map the Order table in DynamoDB
 * May need to add more data models within this directory
 * if we want to sort the data in better ways
 */
@DynamoDBTable(tableName = "OrderTracking")
public class Order {
    
    @DynamoDBHashKey(attributeName = "PK")
    private String customerId;
    
    @DynamoDBRangeKey(attributeName = "SK")
    private String orderId;
    
    @DynamoDBAttribute(attributeName = "orderDate")
    private String orderDate;

    @DynamoDBAttribute(attributeName = "totalAmount")
    private Double totalAmount;

    // Getters and Setters
}
