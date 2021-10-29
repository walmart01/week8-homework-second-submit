package homework_8;
/*Write a program to input any number and check if it Armstrong number or not
        153 = (1*1*1)+(5*5*5)+(3*3*3)*/

public class Ans_10 {

    public static void main(String[] args) {
         int n =153;
         int r, sum=0;
         int temp=0;

          while (n>0){

              r = n % 10;
              n =n / 10;
              sum = sum + r*r*r;

          }
          if (temp==sum)
              System.out.println("Its an Armstrong number");
          else
              System.out.println("Not an Armstrong number");
    }

}
