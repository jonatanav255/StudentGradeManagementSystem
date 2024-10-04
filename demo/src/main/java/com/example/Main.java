package com.example;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // System.out.println("Hello world!");
        Student student = new Student("123", "John Doe");
        student.addGrade("Math", 95.0);
        student.addGrade("English", 88.5);
        student.addGrade("History", 76.0);

        // Double studentAverage = student.calculateStudentAverage();
        Double studentSpecificGrade = student.returnSpecificGrade("Mathasdas");
        System.out.println(studentSpecificGrade);
    }
}
