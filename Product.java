package com.jsp.Mod2.Constructors;

/**
 * Topic: Constructor Overloading
 * Real-World Example: Product Management System
 */
public class Product {

    String productName;
    String brand;
    double price;
    int discount;

    // 1. Constructor with 2 parameters
    public Product(String productName, String brand) {
        this.productName = productName;
        this.brand = brand;
        this.price = 0.0; // Default price if not provided
        System.out.println("2-Arg Constructor: Basic details added.");
    }

    // 2. Constructor with 3 parameters (Overloaded)
    public Product(String productName, String brand, double price) {
        this.productName = productName;
        this.brand = brand;
        this.price = price;
        System.out.println("3-Arg Constructor: Price included.");
    }

    // 3. Constructor with 4 parameters (Overloaded)
    public Product(String productName, String brand, double price, int discount) {
        this.productName = productName;
        this.brand = brand;
        this.price = price;
        this.discount = discount;
        System.out.println("4-Arg Constructor: Discount offer included.");
    }

    public void displayProduct() {
        System.out.println("Item: " + productName + " (" + brand + ")");
        System.out.println("Price: ₹" + price);
        System.out.println("Discount: " + discount + "%");
        System.out.println("--------------------------------------");
    }

    public static void main(String[] args) {
        
        // Scenario 1: Only name and brand are known
        Product p1 = new Product("Watch", "Titan");
        p1.displayProduct();

        // Scenario 2: Price is also known
        Product p2 = new Product("Smartphone", "Samsung", 55000.00);
        p2.displayProduct();

        // Scenario 3: All details including discount are known
        Product p3 = new Product("Laptop", "HP", 72000.00, 10);
        p3.displayProduct();
    }
}
