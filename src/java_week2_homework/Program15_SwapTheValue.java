package java_week2_homework;

import java.util.Scanner;

/**
 * Write a Java program to swap two variables.
 */
public class Program15_SwapTheValue {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("Enter the first variable value: ");
        int first = sca.nextInt();
        System.out.println("Enter the second variable value: ");
        int second = sca.nextInt();
        Program15_SwapTheValue obj=new Program15_SwapTheValue();
        obj.swapTheValue(first,second);
        //closing the scanner object
        sca.close();
    }

    //swapping the value of variables
    public void swapTheValue(int a, int b){
        int c;
        System.out.println("Before swapping, the values of first variables is :" + a + " and second variable is: " + b );
        c=a;
        a=b;
        b=c;
        System.out.println("After swapping, the values of first variables is :" + a + " and second variable is: " +b );
    }
}
