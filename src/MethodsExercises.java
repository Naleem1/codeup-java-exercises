import java.util.Scanner;

public class MethodsExercises {
    public static long add(long num1, long num2) {
        long sum = num1 + num2;
        return sum;
    }
    public static long subtraction(long num1, long num2) {
        long sum = num1 - num2;
        return sum;
    }
    public static long multiplication(long num1, long num2) {
        long sum = num1 * num2;
        return sum;
    }
    public static long division(long num1, long num2) {
        long sum = num1 / num2;
        return sum;
    }
    public static long modulus(long num1, long num2) {
        long sum = num1 % num2;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(add(5,4));
        System.out.println(subtraction(5,4));
        System.out.println(multiplication(5,4));
        System.out.println(division(5,4));
        System.out.println(modulus(5,4));
    }


}
