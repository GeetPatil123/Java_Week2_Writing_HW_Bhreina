package java_week2_homework;

import java.util.Scanner;

/*Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
*/
public class Program16_AddTwoBinary {
    public static void main(String[] args) {
        System.out.println("Welcome to java program to add two binary numbers: ");
        //scanner declaration for reading input from console
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter the first binary number: ");
        String first = sca.nextLine();
        System.out.println("Enter the second binary number: ");
        String second = sca.nextLine();
        String addition = addTwoBinaryNumber(first,second);
        System.out.println("The addition of two numbers is : " +addition);
        //closing scanner object
        sca.close();
    }

    //adding two binary number
    public static String addTwoBinaryNumber(String first, String second){
        int b1 = Integer.parseInt(first, 2);
        int b2 = Integer.parseInt(second, 2);
        int sum = b1 + b2;
        return Integer.toBinaryString(sum);
    }

}
