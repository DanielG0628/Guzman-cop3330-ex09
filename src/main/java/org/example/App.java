package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //declare variables and create scanner
        int length, width;
        double area, amountOfPaint;
        Scanner sc = new Scanner(System.in);

        //prompt user and scan inputs
        System.out.println("Enter length:");
        length = sc.nextInt();
        System.out.println("Enter width:");
        width = sc.nextInt();

        //calculations
        area = length * width;
        amountOfPaint = Math.ceil(area / 350.0);

        //output
        System.out.println("You will need " + (int) amountOfPaint + " gallons of paint to cover " + (int) area + " square feet.");

        //close scanner
        sc.close();
    }
}