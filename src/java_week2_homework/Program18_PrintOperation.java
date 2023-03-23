package java_week2_homework;

import java.util.Scanner;

/**
 * Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */
public class Program18_PrintOperation {

    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner sca=new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int firstNumber=sca.nextInt();
        System.out.println("please enter the second number :");
        int secondNumber=sca.nextInt();
        Program18_PrintOperation obj= new Program18_PrintOperation();
        obj.printTheOperation(firstNumber,secondNumber);
        //closing the scanner obbject
        sca.close();

    }

    //printing all operations
    public void printTheOperation(int a, int b){
        System.out.println("The sum of " + a + " and " + b + " is " + (a+b));
        System.out.println("The difference of " + a + " and " + b + " is " + (a-b));
        System.out.println("The product of " + a + " and " + b + " is " + (a*b));
        System.out.println("The division of " + a + " and " + b + " is " + (a/b));
        System.out.println("The remainder of " + a + " and " + b + " is " + (a%b));

    }
}
