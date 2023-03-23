package java_week2_homework;

import java.util.Scanner;

/**
 * Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */
public class Program19_ConvertStringToLowerCase {
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner sca=new Scanner(System.in);
        System.out.println("Enter the uppercase setatement: ");
        String uppercase=sca.nextLine();
        Program19_ConvertStringToLowerCase obj=new Program19_ConvertStringToLowerCase();
        obj.convertStringToLowerCase(uppercase);
        //closing scanner object
        sca.close();
    }

    //convert string to lower case
    public void convertStringToLowerCase(String str){
        System.out.println("The lowercase of the string is: " + str.toLowerCase());

    }
}
