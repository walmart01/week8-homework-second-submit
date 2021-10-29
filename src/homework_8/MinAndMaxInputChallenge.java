package homework_8;

/*2. -Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.
-Before the user enters the number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum
number.
Hint:
-Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge.*/

import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int maxNumber = 0;
        int minNumber = 0;
        boolean hasMax = false;
        boolean hasMin = true;
        int max = scanner.nextInt();
        int min= scanner.nextInt();

        while (true) {
            System.out.println("Enter number :");
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                if (input > maxNumber) {
                    maxNumber = input;
                    hasMax = true;
                }
                if (input < minNumber) {
                    minNumber = input;

                    hasMin = true;

                } else {
                    System.out.println("minNumber=" + minNumber);
                    System.out.println("maxNumber=" + maxNumber);
                    break;
                }

            }
        }
}}