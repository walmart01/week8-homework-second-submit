package homework_8;

/*Write a program in Java to display the pattern like a triangle with a number.*/

import java.util.Scanner;

public class Ans_6 {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        int nbre_rows;
        System.out.println("Enter the number of rows");
        nbre_rows = console.nextInt();

        for (int i = 1; i <= nbre_rows; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(j);
            }
            System.out.println("");
        }
    }
}