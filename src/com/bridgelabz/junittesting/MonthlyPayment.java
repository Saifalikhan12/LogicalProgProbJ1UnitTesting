package com.bridgelabz.junittesting;

public class MonthlyPayment {
    public static void main(String[] args) {
        //Taking CommandLine Argument Input
        double P = Double.parseDouble(args[0]);
        double R = Double.parseDouble(args[1]);
        double Y = Double.parseDouble(args[2]);

        //Calculating n and r Values
        double n = 12 * Y;
        double r = R / ( 12 * 100 );

        //Calculating Month Payment using given formula
        double monthPayment = (P * r ) / (1 - (Math.pow((1+r), (-n)) ));
        System.out.println("The Payment Per Month is : " + monthPayment);
    }
}