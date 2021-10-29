package homework_8;
/*11. Even Digit Sum
        Write a method named getEvenDigitSum with one parameter of type int called number.
        The method should return the sum of the even digits within the number.
        If the number is negative, the method should return -1 to indicate an invalid value.*/
public class Ans_11 {

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;

        }      int finalNumber = 0;
            while (number > 0) {
                if ((number % 10) % 2 == 0) {
                    finalNumber += number % 10;
                }
                number = number / 10;
            }
            return number;
        }
    }

