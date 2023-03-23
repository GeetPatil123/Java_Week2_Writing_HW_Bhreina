package java_week2_homework;

import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to binary number.
 * Input Data:
 * Input a Decimal Number : 5
 * Expected Output
 * Binary number is: 101
 */
public class Program17_DecimalToBinary {
    public static void main(String[] args) {
    //scanner declaration for reading input from console
        System.out.println("Welcome to java program to convert Decimal to Binary numbers: ");
        //scanner declaration for reading input from console
        Scanner sca=new Scanner(System.in);
        System.out.println("Please enter a decimal number: ");
        int number = sca.nextInt();
        convertDecimalToBinary(number);

        //closing scanner object
        sca.close();

    }

    //converting the decimal to binary
    public static void convertDecimalToBinary(int number){
        String binary = Integer.toBinaryString(number);
        System.out.println("The Binary value is :" +binary);

    }


}
