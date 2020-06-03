package stutter_IsPalindrome;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
public class stutterPalindrome {

	public static void main(String args[]){
	       
        System.out.println("Please Enter a number : ");
        int palindrome = new Scanner(System.in).nextInt();
       
        if(isPalindrome(palindrome)){
            System.out.println("Number : " + palindrome + " is a palindrome");
        }else{
            System.out.println("Number : " + palindrome + " is not a palindrome");
        }      
       
    }
 
    /*
     * Java method to check if a number is palindrome or not
     */
    public static boolean isPalindrome(int number) {
        int palindrome = number; // copied number into variable
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        // if original and reverse of number is equal means
        // number is palindrome in Java
        if (number == reverse) {
            return true;
        }
        return false;
    }
    public void stutter(Stack<Integer> s) {
        Queue<Integer> q = new LinkedList<Integer>();
            
        while(!s.isEmpty())
            q.add(s.pop());
                            
        while(!q.isEmpty())
            s.push(q.remove());
                                            
        while(!s.isEmpty())
            q.add(s.pop());
                                                            
        while(!q.isEmpty()) {
            int n = q.remove();
            s.push(n);
            s.push(n);
        }
    }
   
}

