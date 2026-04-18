/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.regandlogin1;

/**
 *
 * @author Lesego Hanyane
 */

import java.util.Scanner;

public class RegAndLogin1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Login_1 login;

        String result;

        System.out.println("=== REGISTRATION ===");

        
        while (true) {

            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            System.out.print("Enter phone (+27...): ");
            String phone = scanner.nextLine();

            login = new Login_1(username, password, phone);

            result = login.registerUser(); 
            System.out.println(result);

            if (result.contains("successful")) {
                break; 
            }

            System.out.println("Please try again...\n");
        }

        
        System.out.println("\n=== LOGIN ===");

        Login_1 loginAttempt = new Login_1();

        while (true) {

            System.out.print("Enter username: ");
            String enteredUsername = scanner.nextLine();

            System.out.print("Enter password: ");
            String enteredPassword = scanner.nextLine();

            boolean success = loginAttempt.loginUser(enteredUsername, enteredPassword);

            if (success) {
                System.out.print("Enter first name: ");
                String firstName = scanner.nextLine();

                System.out.print("Enter last name: ");
                String lastName = scanner.nextLine();

                System.out.println(loginAttempt.returnLoginStatus(success, firstName, lastName));
                break;
            } else {
                System.out.println(" Incorrect details, try again.\n");
            }
        }

        scanner.close();
    }
}