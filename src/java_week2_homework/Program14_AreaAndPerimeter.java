package java_week2_homework;

import java.util.Scanner;

/*
 *Write a Java program to print the area and perimeter of a rectangle.
 *Test Data:
 *Width = 5.5 Height = 8.5
 *Expected Output:
 *Area is 5.6 * 8.5 = 47.60
 *Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class Program14_AreaAndPerimeter {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("Enter the width of the Rectangle: ");
        double width = sca.nextDouble();
        System.out.println("Enter the height of the Rectangle: ");
        double height = sca.nextDouble();
        areaAndPerimeterOfRectangle(height, width);
        //closing scanner object
        sca .close();
    }
    //calculating area and perimeter of rectangle
    public static void areaAndPerimeterOfRectangle(double height, double width){

        double area = (height * width);
        double perimeter = 2 * (height * width);
        System.out.println("The area od the Rectangle: " +area);
        System.out.println("The perimeter of Rectangle :" +perimeter);

    }

}
