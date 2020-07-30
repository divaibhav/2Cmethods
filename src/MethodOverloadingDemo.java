/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 30-Jul-20
 *  Time: 12:35 PM
 */
/*
Create a method add, which accept two integer aurguments
and create another method with same name, which accept three integer
argments, to demonstrate method overloading
 */
public class MethodOverloadingDemo {
    public static void main(String[] args) {
        MethodOverloadingDemo obj = new MethodOverloadingDemo();
        System.out.println(obj.add(12.4, 12));
    }

    public int add(int no1, int no2) {
        System.out.println("2 integer arguments");
        int resposne = 0;
        resposne = no1 + no2;
        return resposne;
    }

    public double add(int no1, int no2, int no3) {
        System.out.println("3 integer arguments");
        double response = 0;
        response = no1 + no2 + no3;
        return response;
    }

    public double add(double no1, double no2) {
        System.out.println("2 double arguments");
        double response = no1 + no2;
        return response;
    }

    public double add(int no1, double no2) {
        System.out.println(" int double arguments");
        double response = no1 + no2;
        return response;
    }
}
