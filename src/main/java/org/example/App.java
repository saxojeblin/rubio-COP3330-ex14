/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

package org.example;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {

        double order_amount, tax, total;
        String state, strOrderAmount;
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        strOrderAmount = sc.nextLine();
        System.out.print("What is the state? ");
        state = sc.nextLine();

        order_amount = Double.parseDouble(strOrderAmount);
        total = order_amount;

        if (state.equals("WI")) {
            tax = .055 * total;
            total += tax;
            System.out.printf("The subtotal is $%.2f.\nThe tax is $%.2f.\n",order_amount, tax);
        }

        System.out.printf("The total is $%.2f.", total);
    }
}
