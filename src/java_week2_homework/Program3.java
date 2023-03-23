package java_week2_homework;
/**
 * Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Program3 {

    // declare one instance and one static variable
    String name = "Bhreina";
    static String surName = "Patel";

    //declare one instance method
    //call both instance and static variable into the instance method into the print statement
    public void instanceMethod(){
        System.out.println(name);
    }

    //declare one static method
    //call both instance and static variables into the static method into the print statement
    public static void staticMethod(){

        System.out.println(surName);
    }

    //declare the main method
    //call both instance and static method into the main method and run the program
    public static void main(String[] args) {
        Program3 obj = new Program3();
        obj.instanceMethod();
        staticMethod();
    }







}
