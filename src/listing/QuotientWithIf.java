package listing;

import java.util.Scanner;

public class QuotientWithIf {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("inter two integers : ");
        int number1= input.nextInt();
        int number2= input.nextInt();
        if(number1 !=0)
            System.out.println(number1 + "/" + number2 + "is" + (number1/number2));
        else
            System.out.println("divisor can not be zero");
    }
}