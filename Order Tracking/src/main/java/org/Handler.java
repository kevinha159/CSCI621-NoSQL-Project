import java.net.URI;

import software.amazon.awssdk.services.dynamodb.DynamoDbClient;


public class Handler {
    private final DynamoDbClient dynamoDbClient;

    public Handler() {
        dynamoDbClient = DynamoDbClient.builder()
            .endpointOverride(URI.create("http://localhost:8000"))  // DynamoDB Local endpoint
            .region(software.amazon.awssdk.regions.Region.US_EAST_1)  
            .build();    
    }

    public void sendRequest() {
        // TODO: invoking the api calls using dynamoDbClient.
    }
}
