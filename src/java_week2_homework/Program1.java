package java_week2_homework;

/**
 * Write a Java programme using the following steps.
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */
public class Program1 {

    // declare tow instance variables
    int a = 10;
    int b = 20;

    // declare one instance method
    // call both instance variables into instance method inside the print statement
    public void instanceMethod() {
        System.out.println(a);
        System.out.println(b);
    }

    //declare main method
    // call the above instance method into the main method and run the program
    public static void main(String[] args) {

        Program1 obj = new Program1();
        obj.instanceMethod();
    }
}
