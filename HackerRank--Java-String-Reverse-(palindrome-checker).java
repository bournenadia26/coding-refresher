import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        char[] arr = A.toCharArray();
        Stack<Character> charStack = new Stack<>();
        for (char c : arr) {
            charStack.push(c);
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (charStack.pop() != arr[i]) {
                System.out.println("No");
                break;
            }
            else if (i == arr.length-1) {
                System.out.println("Yes");
            }
        }     
    }
}



