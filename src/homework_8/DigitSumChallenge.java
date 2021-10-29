package homework_8;
/*Write a method named hasSharedDigit with two parameters of type int.
        Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
        within the range, the method should return false.
        The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
        otherwise, the method should return false.*/
public class DigitSumChallenge {

     public static void main(String[] args) {

        System.out.println("Sum of 125 is = " + sumDigits(125));
        System.out.println("Sum of 18 is="+sumDigits(18));
        System.out.println("sum of -3 is="+sumDigits(-3));



        }

     public static int sumDigits(int number) {
        if (number < 10) {

        return -1;
        }
        int sumDigits = 0;
        String numberToString = Integer.toString(number);
        for (char c:numberToString.toCharArray()){
           sumDigits+=Integer.parseInt(String.valueOf(c));

        }

        return sumDigits;
        }
        }