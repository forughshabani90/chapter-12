[1mdiff --git a/src/listing/QuotientWithException.java b/src/listing/QuotientWithException.java[m
[1mindex 308d145..03420f2 100644[m
[1m--- a/src/listing/QuotientWithException.java[m
[1m+++ b/src/listing/QuotientWithException.java[m
[36m@@ -1,5 +1,6 @@[m
 package listing;[m
 [m
[32m+[m[32mimport java.util.InputMismatchException;[m
 import java.util.Scanner;[m
 [m
 public class QuotientWithException {[m
[36m@@ -7,23 +8,33 @@[m [mpublic class QuotientWithException {[m
         if (number2 == 0) {[m
             throw new ArithmeticException("divisor can not be zero");[m
         }[m
[31m-            return number1 / number2;[m
[32m+[m[32m        return number1 / number2;[m
 [m
     }[m
 [m
     public static void main(String[] args) {[m
         Scanner input = new Scanner(System.in);[m
         System.out.println("enter two integer: ");[m
[31m-        int number1 = input.nextInt();[m
[31m-        int number2 = input.nextInt();[m
[32m+[m[32m        int number1=0;[m
[32m+[m[32m        int number2=0;[m
[32m+[m[32m       try{[m
[32m+[m[32m            number1 = input.nextInt();[m
[32m+[m[32m            number2 = input.nextInt();[m
[32m+[m[32m       }catch (InputMismatchException ex) {[m
[32m+[m
[32m+[m[32m           System.out.println("input not valid");[m
[32m+[m[32m       }[m
         try {[m
[31m-           double result = quotient1(number1, number2);[m
[32m+[m[32m            double result = quotient1(number1, number2);[m
             System.out.println(number1 + "/" + number2 + "is" + result);[m
[32m+[m[32m        } catch (ArithmeticException ex) {[m
[32m+[m[32m            System.out.println("Exception : an integer " + "can not be divisor by zero");[m
[32m+[m[32m            System.out.println(ex.getMessage());[m
[32m+[m[32m//            ex.printStackTrace();[m
         }[m
[31m-            catch(ArithmeticException ex){[m
[31m-                System.out.println("Exception : an integer " + "can not be divisor by zero");[m
[31m-            }[m
[31m-            System.out.println("Execution continues...");[m
[31m-        }[m
[31m-[m
[32m+[m[32m        System.out.println("Execution continues...");[m
[32m+[m[32m        String s = input.next();[m
[32m+[m[32m        System.out.println(s);[m
     }[m
[32m+[m
[32m+[m[32m}[m
