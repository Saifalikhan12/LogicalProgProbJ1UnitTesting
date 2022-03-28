package com.bridgelabz.junittesting;

import java.util.Scanner;

public class Binary {
    private static int[] toBinary(int paramNum) {
        int temp = paramNum , i = 0, j = 0;

        //Initializing array for Storing Binary Values
        int[] arr = new int[8];

        //Repeat till 8 bits
        for(i=0; i<8; i++) {
            if(temp > 0) {
                arr[i] = temp % 2;
                temp = temp / 2;
            } else {
                arr[i] = 0;
            }
        }

        //Printing the Binary and Decimal Compositions
        System.out.println("The Binary No and Decimal Composition for Number "+paramNum);
        for(j = 7; j >= 0; j--) {
            if(arr[j] == 1) {
                int no =(int) Math.pow(2,j);
                System.out.println(arr[j]+"\t"+no);
            } else {
                System.out.println(arr[j]+"\t0");
            }
        }
        return arr;
    }

    //Swapping the Nibbles and Calculating the New Decimal Number
    private static int swapNibbles(int[] paramArr) {
        int i, j = paramArr.length / 2, newDecNo = 0;

        //Swapping of Nibbles
        for( i=0; i< paramArr.length /2; i++ ) {
            int temp = paramArr[i];
            paramArr[i] = paramArr[j];
            paramArr[j] = temp;
            j++;
        }

        //Calculating the New Decimal Number after Swapping of Nibbles
        System.out.println("After Swapping Nibbles, Binary No and Decimal Compositions:");
        for(j = 7; j >= 0; j--) {
            if(paramArr[j] == 1) {
                int no =(int) Math.pow(2,j);
                newDecNo += no;
                System.out.println(paramArr[j]+"\t"+no);
            } else {
                System.out.println(paramArr[j]+"\t0");
            }
        }
        return newDecNo;
    }
    public static void main(String[] args) {
        //Scanner Object for User Input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Decimal Number :");
        int num = sc.nextInt();

        //Calling toBinary method to Convert Decimal to Binary
        int[] arr = toBinary(num);

        //Calling swapNibbles method to Swap Nibbles and Generate New Decimal No
        int newDecNo = swapNibbles(arr);
        System.out.println("After Swapping the Nibbles New Decimal No is : "+ newDecNo);
    }
}