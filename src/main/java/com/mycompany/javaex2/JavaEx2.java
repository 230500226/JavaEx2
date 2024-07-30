/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaex2;

/**
 *
 * @author ldxt460s
 */
import java.util.Scanner;
public class JavaEx2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please choose an option:");
        System.out.println("1. Access Account");
        System.out.println("2. Access GradeBook");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Access Account
                Account myAccount = new Account(100.00);
                myAccount.displayBalance();
                myAccount.debit(50.00);
                myAccount.displayBalance();
                myAccount.debit(60.00);
                myAccount.displayBalance();
                break;
            case 2:
                // Access GradeBook
                GradeBook myGradeBook = new GradeBook("Software Design - Java Development", "Prof. Mataifa");
                myGradeBook.displayMessage("Software Design - Java Development");
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }

        scanner.close();
    }
}
