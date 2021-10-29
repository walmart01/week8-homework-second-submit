package homework_8;
/*Palindrome Number
        Write a method called isPalindrome with one int parameter called number.
        The method needs to return a boolean.
        It should return true if the number is a palindrome number otherwise it should return false.
        Check the tips below for more info about palindromes.
        Example Input/Output
        isPalindrome(-1221); → should return true
        isPalindrome(707); → should return true
        isPalindrome(11212); → should return false because the reverse is 21211 and that is not equal to
        11212.*/
import java.util.Scanner;

public class PalindromeChallenge {

    public static void main(String[] args) {

        System.out.println("Enter a number:");
        int palindrome = new Scanner(System.in).nextInt();

        if (isPalindrome(palindrome)) {
            System.out.println("Number :" + palindrome + "is a palindrome");

        } else {
            System.out.println("Number :" + palindrome + "is not palindrome");

        }
    }

    public static boolean isPalindrome(int number) {
        int palindrome = number;
        int reverse = 0;
        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;

        }
        if(number==reverse) {
            return true;
        }
        return false;
    }
}