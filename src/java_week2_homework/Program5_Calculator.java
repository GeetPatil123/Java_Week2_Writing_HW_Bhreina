package java_week2_homework;

import java.util.Scanner;

/**
 * Write a program for a calculator with addition, subtraction, multiplication and division
 * methods all with parameters and use string concatenation methods.
 * (Note: Two static and Two instance methods.)
 */

public class Program5_Calculator {
    //declare two static and two instance method
    // static method addition
    public static void addition(int a, int b) {
        int result = a + b;
        System.out.println("The addition of" + a + "and" + b + "is : " + result);
    }
    //declare static method subtraction
    public static int subtraction(int a, int b){
        return a-b;
    }
    //declare two static and two instance method
    // multiplication instance method
    public void multiplication(int a, int b){
        int result = a*b;
        System.out.println("The multiplication of" + a + "and" + b + "is : " + result);
    }
    public int division(int a, int b){
       return a / b;
    }

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner sca = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int a = sca.nextInt();
        System.out.println("Please enter the second number:");
        int b = sca.nextInt();

        addition(a,b);

        int sunResult = subtraction(a,b);
        System.out.println("The subtraction of " + a + " and " + b + " is : " + sunResult);

        Program5_Calculator obj=new Program5_Calculator();
        obj.multiplication(a,b);

        int divResult = obj.division(a, b);
        System.out.println("The division of " + a + " and " + b + " is : " + divResult);
        //closing the scanner object
        sca.close();
    }
}
