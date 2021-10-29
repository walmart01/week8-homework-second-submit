package homework_8;

import java.util.Scanner;

public class Ans14 {

    public static void main(String args[]) {

    int i,j,k;
        Scanner scanner=new Scanner(System.in);

    System.out.print("Enter the number  of rows: ");
     int row=scanner.nextInt();

    i=1;
    while(i<=row){
        j=1;
        while(j<=row-i){
            System.out.print(" ");
            j++;
        }
        j=1;
        while(j<=i){
            System.out.print("*"+" ");
            j++;
        }
        i++;
        System.out.print("\n");
    }
    i=1;
    while(i<=row-1){
        j=1;
        while(j<=i){
            System.out.print(" ");
            j++;
        }
        j=1;
        while(j<=row-i){
            System.out.print("*"+" ");
            j++;
        }
        i++;
        System.out.print("\n");
    }
}


}
