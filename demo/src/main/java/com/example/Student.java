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

    // Add grade for a specific course
    public String addGrade(String course, Double grade) {
        if (grade < 0 || grade > 100) {
            return "Invalid grade. It should be between 0 and 100.";
        }
        grades.put(course, grade);
        return "Grade for course '" + course + "' has been successfully added.";
    }

    // Retrieve all grades
    public Map<String, Double> getAllGrades() {
        return grades;
    }

    // Calculate the Average Grade
    public String calculateStudentAverage() {
        if (grades.isEmpty()) {
            return "Student has no grades to calculate the average.";
        }

        double totalGrades = 0.0;
        for (Double grade : grades.values()) {
            totalGrades += grade;
        }

        Double averageGrade = totalGrades / grades.size();
        return "The average grade across " + grades.size() + " courses is: " + averageGrade;
    }

    // Retrieve a Grade for a Specific Course
    public String returnSpecificGrade(String course) {
        if (!grades.containsKey(course)) {
            return "Course '" + course + "' not found.";
        }
        return "The grade for '" + course + "' is: " + grades.get(course);
    }

    // Update an Existing Grade
    public String updateGrade(String course, Double newGrade) {
        if (grades.containsKey(course)) {
            grades.put(course, newGrade); // Update the grade with the new value
            return "The grade for course '" + course + "' has been updated to " + newGrade;
        } else {
            return "Course '" + course + "' not found.";
        }
    }

    // Remove a Grade for a Course
    public String removeGrade(String course) {
        if (grades.containsKey(course)) {
            grades.remove(course);
            return "The grade for course '" + course + "' was successfully removed.";
        } else {
            return "The course '" + course + "' was not found.";
        }
    }

}
