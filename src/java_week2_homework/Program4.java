package java_week2_homework;
/**
 * Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Program4 {

    //declare two instance and tow static variables
    //instance variabel
    String name = "Bhreina";
    String surNmae= "Patel";

    //static variables
   static boolean a = true;
   static boolean b = false;

    //declare one instance method
    //call all four instance variables and static variables into both instance and static method inside a print statement
    public void instancemethod(){
        System.out.println(name);
        System.out.println(surNmae);
        System.out.println(a);
        System.out.println(b);
        System.out.println();
    }

    //declare one static method
    //call all four instance variables and static variables into both instance and static method inside a print statement
    public static void staticMethod(){
        Program4 obj = new Program4();
        System.out.println(obj.name);
        System.out.println(obj.surNmae);
        System.out.println(a);
        System.out.println(b);
    }

    //declare the main method
    //call both instance and static methods into the main method and run the program
    public static void main(String[] args) {
        Program4 obj =new Program4();
        obj.instancemethod();
        staticMethod();
    }
}
