package com.bridgelabz.junittesting;

public class DayOfWeek {
    public static void main(String[] args) {

        //Get Day, Month and Year Input from Command Line Argument
        int day = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);
        int year = Integer.parseInt(args[2]);

        //Calculating the Gregorian Calendar Values
        int y = year - (14 - month ) / 12 ;
        int x = y + (y/4) - (y/100) + (y/400);
        int m = month + 12 * ((14 - month)/12) - 2;
        int d = (day + x + (31* m )/12 ) % 7;

        //Creating Array for Storing Days of Week
        String daysArray [] =  {"Sunday" ,"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday" };
        System.out.println("Day at "+ day +"/"+ month +"/"+ year +" from Week is "+ daysArray[d]);
    }
}