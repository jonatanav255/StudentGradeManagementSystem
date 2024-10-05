package com.example;

import java.util.HashMap;
import java.util.Map;

public class StudentManager {

    private Map<String, Student> students;

    // Initialize the map in the constructor
    public StudentManager() {
        this.students = new HashMap<>();
    }

    // Add student to the manager, with feedback if student already exists
    public String addStudent(String studentId, Student student) {
        if (students.containsKey(studentId)) {
            return "Student with ID '" + studentId + "' already exists.";
        }
        students.put(studentId, student);
        return "Student '" + student.getName() + "' has been added.";
    }

    // Retrieve student by ID
    public Student getStudent(String studentId) {
        return students.getOrDefault(studentId, null); // Return null if not found
    }

    // Remove student by ID, with feedback
    public String removeStudent(String studentId) {
        if (students.containsKey(studentId)) {
            students.remove(studentId);
            return "Student with ID '" + studentId + "' has been removed.";
        } else {
            return "Student with ID '" + studentId + "' not found.";
        }
    }

    // List all students with formatted output
    public String listAllStudents() {
        if (students.isEmpty()) {
            return "No students found.";
        }
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, Student> entry : students.entrySet()) {
            result.append("ID: ").append(entry.getKey())
                  .append(", Name: ").append(entry.getValue().getName())
                  .append("\n");
        }
        return result.toString();
    }
}
