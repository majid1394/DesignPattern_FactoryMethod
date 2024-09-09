package com.example.factory_method;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//In this example, the `Product` interface defines the common behavior for all products.
// The `ConcreteProductA` and `ConcreteProductB` classes implement this interface with their own specific implementations.
// The `ProductFactory` class is responsible for creating instances of these concrete products based on the input type.
// The client code then uses the factory to create and interact with the products without needing to know the specific implementation details.

//

@SpringBootApplication
//client code
public class FactoryMethodApplication {

    public static void main(String[] args) {

        ProductFactory factory = new ProductFactory();

        Product productA = factory.createProduct("A");
        productA.display();

        Product productB = factory.createProduct("B");
        productB.display();

        SpringApplication.run(FactoryMethodApplication.class, args);
    }
}
