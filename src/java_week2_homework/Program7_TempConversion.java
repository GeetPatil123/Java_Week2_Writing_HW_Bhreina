package java_week2_homework;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit
 * and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

public class Program7_TempConversion {

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner sca=new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit :" );
        float temp = sca.nextFloat();
        //object creation

        Program7_TempConversion obj=new Program7_TempConversion();
        obj.convertTempToDegreeCelsius(temp);
            
        sca.close();
    }

    //temperation conversion method
    public void convertTempToDegreeCelsius(float temp){
        float c = ((temp - 32) * 5 / 9);
        System.out.println("The temperature " + temp + "Fahrenheit is equal to " + c + "degree celsius");
    }
}
