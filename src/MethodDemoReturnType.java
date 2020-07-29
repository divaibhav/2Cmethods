/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 29-Jul-20
 *  Time: 1:23 PM
 */
/*
Create a method called add, which accept two arguments of type int
and return an integer value that is the sum of two numbers.
Accept the numbers from user
 */

import java.util.Scanner;

public class MethodDemoReturnType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two integers");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        //declaring a variable to store result of function call
        // calling a method add
        int result = add(number1, number2);
        System.out.println("Sum = " + result);
    }

    //declaring and defining add method
    public static int add(int no1, int no2) {
        //return variable called response,
        // that will hold the result that we are going to return
        int response = 0;
        //task or functionality
        response = no1 + no2;
        //returning result to calling function
        return response;
    }
}
