package com.example;


public class Main {
    public static void main(String[] args) {
        // Initialize StudentManager
        StudentManager manager = new StudentManager();

        // Add students to the manager
        manager.addStudent("S001", new Student("1", "Alice"));
        manager.addStudent("S002", new Student("2", "Bob"));

        // Retrieve a student and list all students
        System.out.println(manager.getStudent("S001").getName()); // Output: Alice
        System.out.println(manager.listAllStudents());
    }
}
