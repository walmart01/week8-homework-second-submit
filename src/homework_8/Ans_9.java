package homework_8;

/*Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)*/


import java.util.Scanner;

public class Ans_9 {
    public static void main(String[] args) {

        int count,num1=0,num2=1;

        System.out.println("How may numbers you want in the sequence");

        Scanner scanner=new Scanner(System.in);
        count=scanner.nextInt();
        scanner.close();
        System.out.print("Fibonacci Series of "+count+" numbers:");

        int i=1;
        while (i<=count){
            System.out.println(num1+"");
            int sumOfPrevTwo=num1+num2;
            num1=num2;
            num2=sumOfPrevTwo;
            i++;
        }
    }
}

