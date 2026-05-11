package com.jsp.Mod2.Constructors;

/**
 * Topic: Constructor Chaining using this()
 * Real-World Example: User Registration System
 */
public class UserAccount {

    String username;
    long phoneNumber;
    String email;

    // 1. Single Argument Constructor
    public UserAccount(String username) {
        this.username = username;
        System.out.println("Step 1: Username initialized.");
    }

    // 2. Two Argument Constructor (Chained to #1)
    public UserAccount(String username, long phoneNumber) {
        this(username); // Calling the 1-arg constructor
        this.phoneNumber = phoneNumber;
        System.out.println("Step 2: Phone number initialized.");
    }

    // 3. Three Argument Constructor (Chained to #2)
    public UserAccount(String username, long phoneNumber, String email) {
        this(username, phoneNumber); // Calling the 2-arg constructor
        this.email = email;
        System.out.println("Step 3: Email initialized.");
    }

    public void displayUser() {
        System.out.println("--- Profile Summary ---");
        System.out.println("User: " + username);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Email: " + email);
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        // This call starts the chain from 3rd -> 2nd -> 1st constructor
        System.out.println("Starting registration for Abhisheka...");
        UserAccount user = new UserAccount("Abhisheka", 9876543210L, "abhisheka@email.com");
        
        user.displayUser();
    }
}
