package com.example;

public class Main {
    public static void main(String[] args) {
        // Create a new student
        Student student = new Student("123", "John Doe");

        // Add grades
        System.out.println(student.addGrade("Math", 95.0));
        System.out.println(student.addGrade("Science", 85.5));

        // Get all grades
        System.out.println(student.getAllGrades());

        // Calculate average
        System.out.println(student.calculateStudentAverage());

        // Get specific grade
        System.out.println(student.returnSpecificGrade("Math"));

        // Update a grade
        System.out.println(student.updateGrade("Science", 90.0));

        // Remove a grade
        System.out.println(student.removeGrade("Math"));
    }
}
