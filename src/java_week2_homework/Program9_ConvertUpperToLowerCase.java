package java_week2_homework;

import java.util.Scanner;

public class Program9_ConvertUpperToLowerCase {

    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter an upper case string : ");
        String uppercase = sca.nextLine();
        Program9_ConvertUpperToLowerCase obj=new Program9_ConvertUpperToLowerCase();
        obj.convertUppercaseToLowerCase(uppercase);

        //closing the scanner
        sca.close();

    }
    // conversion of uppercase to lower case method
    public void convertUppercaseToLowerCase(String text){
        System.out.println("The Lower case value is = " + text.toLowerCase());

    }



}
