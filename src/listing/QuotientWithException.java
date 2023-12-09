package listing;

import java.util.Scanner;

public class QuotientWithException {
    public static int quotient1(int number1, int number2) {
        if (number2 == 0) {
            throw new ArithmeticException("divisor can not be zero");
        }
            return number1 / number2;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter two integer: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        try {
           double result = quotient1(number1, number2);
            System.out.println(number1 + "/" + number2 + "is" + result);
        }
            catch(ArithmeticException ex){
                System.out.println("Exception : an integer " + "can not be divisor by zero");
            }
            System.out.println("Execution continues...");
        }

    }
