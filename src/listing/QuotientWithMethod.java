package listing;

import java.util.Scanner;

public class QuotientWithMethod {
    public static int quotient(int number1 , int number2) {
        if (number1 == 0) {
            System.out.println("divisor can not be zero");
            System.exit(1);
        }
        return number1 / number2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("inter two integer");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int result = quotient(number1, number2);
        System.out.println(number1 + "/" + number2 + "is" + result);

    }
}
