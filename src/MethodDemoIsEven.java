import java.util.Scanner;

/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 29-Jul-20
 *  Time: 1:41 PM
 */
/*
Create a method isEven(int no1),
which accept one argument of type int and return true if no1 is
even otherwise false.
 */
public class MethodDemoIsEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an integer");
        int no1 = sc.nextInt();
        //creating an object to call facntion
        MethodDemoIsEven object = new MethodDemoIsEven();
        boolean result = object.isEven(no1);
        System.out.println("the given numbr is Even -->" + result);
    }

    public boolean isEven(int no1) {
        boolean response = false;
        if (no1 % 2 == 0) {
            response = true;
        }
        return response;
    }
}
