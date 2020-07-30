import java.util.Arrays;

/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 30-Jul-20
 *  Time: 12:49 PM
 */
//we will pass arr as argument and add all the
// elements then will modify eaach index of arr to 0
public class MethodCallByReference {
    public static void main(String[] args) {
        MethodCallByReference obj = new MethodCallByReference();
        int[] brr = {10, 20, 30, 49};
        System.out.println(obj.add(brr));
        System.out.println(Arrays.toString(brr));

    }

    public int add(int[] arr) {
        int response = 0;
        for (int i = 0; i < arr.length; i++) {
            response = response + arr[i];
            arr[i] = 0;
        }
        return response;
    }
}
