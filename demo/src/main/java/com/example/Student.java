package com.example;

import java.util.HashMap;

import java.util.Map;

public class Student {

    private String studentId;
    private String name;
    private Map<String, Double> grades;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.grades = new HashMap<>(); // Initialize the HashMap
    }

    // Getter and setter for studentId
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    // Getter and setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String addGrade(String course, Double grade) {
        grades.put(course, grade);
        return "Grade for course '" + course + "' has been successfully added";
    }

    public Map<String, Double> getAllGrades() {
        return grades;

    }

    // Calculate the Average Grade
    // Objective: Implement a method to calculate and return the student's average grade across all courses.
    public Double calculateStudentAverage() {

        if (grades == null || grades.isEmpty()) {
            System.out.println("Student has no grades");
            return null;
        }

        double totalGrades = 0.0;
        int numberOfGrades = grades.size();

        for (Map.Entry<String, Double> entry : grades.entrySet()) {
            // String key = entry.getKey();
            Double grade = entry.getValue();

            totalGrades += grade;
        }

        Double averageGrade = totalGrades / numberOfGrades;

        return averageGrade;

    }
}
