/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rachel Cameron
 */

import java.util.Scanner;

public class exercise18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.\nYour choice:");
        char temptype = Character.toUpperCase(input.next().charAt(0));
        if(temptype == 'C') {
            System.out.println("Please enter the temperature in Fahrenheit:");
            double fahrenheit = input.nextDouble();
            double conversion = ((fahrenheit - 32) * 5/9);
            System.out.printf("The temperature in Celsius is %.2f", conversion);
        }
        else if(temptype == 'F') {
            System.out.println("Please enter the temperature in Celsius:");
            double celsius = input.nextDouble();
            double conversion = ((celsius * 9/5) + 32);
            System.out.printf("The temperature in Fahrenheit is %.2f", conversion);
        }

    }
}