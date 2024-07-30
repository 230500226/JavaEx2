/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaex2;

/**
 *
 * @author ldxt460s
 */
public class JavaEx2 {

    public static void main(String[] args) {
        //Create an instance of GradeBook
        GradeBook myGradeBook = new GradeBook("Java Programming", "Mr. Smith");

        //Set the course instructor
        myGradeBook.setCourseInstructor("Mr. Mataifa");

        //Get the course instructor
        System.out.printf("The course instructor is: %s\n", myGradeBook.getCourseInstructor());

        //Display the welcome message
        myGradeBook.displayMessage("Software design - Java Programming");
    }
}
