package java_week2_homework;

import java.util.Scanner;

/*
 *Write a Java program that takes three numbers as input to calculate and
 *print the average of the numbers.
 */
public class Program13_AverageOfNumber {
    public static void main(String[] args) {
        // scanner declaration for reading input from console
        Scanner sca=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double x = sca.nextDouble();
        System.out.println("Enter the second number: ");
        double y = sca.nextDouble();
        System.out.println("Enter the third number: ");
        double z = sca.nextDouble();
        averageOfThreeNumbers(x,y,z);

        //closing the scanner object
        sca.close();
    }

    //calculation the average of three numbers
    public static void averageOfThreeNumbers(double a,double b, double c){
        double average = (a + b + c) / 3;
        System.out.println("The average of " + a + " , " + b+ " and " + c + " is : " +average);
    }

}
