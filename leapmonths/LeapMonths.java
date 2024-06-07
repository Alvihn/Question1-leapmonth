/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.leapmonths;

/**
 *
 * @author Alvihn-PC
 */

import java.util.Scanner;

public class LeapMonths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a month: ");
        int month = scanner.nextInt();

        if ((month % 4 == 0 && month % 100 != 0) || month % 400 == 0) {
            System.out.println(month + " is a leap month.");
        } else {
            System.out.println(month + " is not a leap month.");
        }
    }
}