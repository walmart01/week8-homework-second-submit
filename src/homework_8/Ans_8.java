package homework_8;

/*Display right angle triangle of @ using nested for loops
@
@@
@@@
@@@@
@@@@@*/


import java.util.Scanner;

public class Ans_8 {

    static Scanner console=new Scanner(System.in);


    public static void main(String[]args){
        int rc=5,i,j,max=1;
        System.out.println("Enter number of row");
        rc=console.nextInt();

        for ( i=1; i<=rc;i++){
            System.out.println();

            for (j=1;j<=1; j++){

                System.out.print("@");
            }
            for(j=1;j<=2;j++){
            System.out.print("@");
            }
            for (j=1;j<=3;j++){
            System.out.print("@");
            }
            for (j=1;j<=4;j++){
                System.out.print("@");
            }
            for (j=1; j<=max;j++){
                System.out.println("@");
            }
            System.out.println("");

            }
            }



}
