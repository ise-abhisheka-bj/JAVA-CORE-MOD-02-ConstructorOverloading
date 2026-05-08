package com.jsp.Mod2.Constructors;

/**
 * Topic: Constructors & 'this' keyword
 * Real-World Example: Student Admission System
 */
public class ConstructorPractice {

    String studentName;
    int studentId;
    String college;

    // 1. User-Defined: Zero-Argument Constructor
    // Every student created with this will belong to the same college by default
    public ConstructorPractice() {
        this.college = "BIET, Davangere"; 
        System.out.println("Zero-Argument Constructor Called: Default College Set.");
    }

    // 2. User-Defined: Parameterized Constructor
    // Allows us to set unique names and IDs for every student
    public ConstructorPractice(String studentName, int studentId) {
        this(); // Calling the Zero-Argument constructor to set the college name
        this.studentName = studentName; // 'this.studentName' is the instance variable
        this.studentId = studentId;     // 'studentId' is the local parameter
        System.out.println("Parameterized Constructor Called for: " + studentName);
    }

    public void display() {
        System.out.println("Name: " + studentName);
        System.out.println("ID: " + studentId);
        System.out.println("College: " + college);
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {
        
        // Creating object using Zero-Argument Constructor
        System.out.println("Creating S1:");
        ConstructorPractice s1 = new ConstructorPractice();
        s1.studentName = "Unknown";
        s1.display();

        // Creating object using Parameterized Constructor
        System.out.println("Creating S2:");
        ConstructorPractice s2 = new ConstructorPractice("Abhisheka", 101);
        s2.display();

        System.out.println("Creating S3:");
        ConstructorPractice s3 = new ConstructorPractice("John Doe", 102);
        s3.display();
    }
}