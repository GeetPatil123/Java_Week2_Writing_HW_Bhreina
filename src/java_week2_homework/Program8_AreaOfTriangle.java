package java_week2_homework;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */
public class Program8_AreaOfTriangle {
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner sca = new Scanner(System.in);
        System.out.println("Please enter the length of a Triangle: ");
        int length = sca.nextInt();
        System.out.println("Please enter the height of the Triangle: ");
        int height = sca.nextInt();
        areaOfTriangle(height,length);
        //closing the scanner
        sca.close();
    }
    //calculating the area of triangle with no return type with parameter method

    public static void areaOfTriangle(int length, int height){
        int area = (length * height) / 2;
        System.out.println("The area of a Triangle is : " +area);
    }
}
