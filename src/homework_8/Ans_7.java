package homework_8;
/*First And Last Digit Sum
        Write a method named sumFirstAndLastDigit with one parameter of type int called number.
        The method needs to find the first and the last digit of the parameter number passed to the method,
        using a loop and return the sum of the first and the last digit of that number.
        If the number is negative then the method needs to return -1 to indicate an invalid value.*/
public class Ans_7 {
    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(1221));
        System.out.println(sumFirstAndLastDigit(2324));
        System.out.println();
        System.out.println();
    }
    public static int sumFirstAndLastDigit(int number){
        if(number<0){
            return -1;
        }
        else if(number==0){
            return 0;

        }else {
            int lastDigit=number%10;
            while (number>10){
                number=number/10;
            }
            int firstDigit=number;
            return (lastDigit+firstDigit);
        }


    }
}
