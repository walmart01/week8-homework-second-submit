package homework_8;

/*Display left angle triangle of * using nested for loops*/

import java.util.Scanner;

public class Ans_15 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n=scanner.nextInt();
        System.out.println("Enter symbol:");

        int i, j, row = 6;

        for (i = 0; i < row; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}