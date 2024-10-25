package com.spring.Mongo_Spring_Project;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        // Using try-with-resources to ensure MongoClient is closed
        try (MongoClient mongoClient = MongoClients.create(new MongoClientURI("mongodb://localhost:27017"))) {
            MongoDatabase database = mongoClient.getDatabase("test-book");
            MongoCollection<Document> collection = database.getCollection("order_books");

            Document query = new Document("status", new Document("$in", Arrays.asList("return", "canceled", "lost")));
            for (Document doc : collection.find(query)) {
                System.out.println(doc.toJson());
            }
        } catch (Exception e) {
            e.printStackTrace(); // Handle exceptions appropriately
        }
    }
}
