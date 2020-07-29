/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 29-Jul-20
 *  Time: 1:06 PM
 */

/*
Create a method called display(), this method will print
"hello world", this method does not return any value.
 */

public class MethodDemo {
    public static void main(String[] args) {
        System.out.println("Application starts");
        //creating object to call method
        MethodDemo object = new MethodDemo();
        //calling the method display
        object.display();
        System.out.println("exiting...");
    }
    //declaring and defining display()
    public void display(){
        //functionality
        System.out.println("hello world");
    }
}
