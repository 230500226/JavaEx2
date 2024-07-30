/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaex2;

/**
 *
 * @author ldxt460s
 */
public class GradeBook {

    private String courseInstructor;

    public void setCourseInstructor(String instructor) {
        courseInstructor = instructor;
    }

    public String getCourseInstructor() {
        return courseInstructor;
    }

    public GradeBook(String courseName, String instructor) {
        courseInstructor = instructor;
    }

    public void displayMessage(String courseName) {
        System.out.printf("Welcome to the grade book for %s!\n", courseName);
        System.out.printf("This course is presented by: %s\n", getCourseInstructor());
    }

}
