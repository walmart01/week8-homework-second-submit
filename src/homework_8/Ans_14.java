package homework_8;
/*14. Write a program in Java to display the pattern like a diamond.*/

import java.util.Scanner;

public class Ans_14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of rows : ");

        int n = scanner.nextInt();
        System.out.print("Enter Symbol : ");

        char c = scanner.next().charAt(0);


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print(c);
            }
            System.out.println();

        }
        for (int i = n - 1; i > 0; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}

