/*
 *  UCF COP3330 Fall 2021 Assignment 11 Solution
 *  Copyright 2021 jeremiah pike
 */



import java.util.Calendar;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {


        Scanner input1 = new Scanner(System.in);

        System.out.println("Enter the amount of euros: ");
        double euros = input1.nextDouble();

        System.out.println("Enter the exchange rate: ");
        double rate = input1.nextDouble();

        double dollars = euros * rate;

        System.out.printf("The US Dollars are: %.2f %n", dollars);





    }
}