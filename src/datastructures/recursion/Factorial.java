package datastructures.recursion;

public class Factorial {

    public static int factorial(int value) {
        if (value == 0 || value == 1)
            return 1;
        return value * factorial(value - 1);
    }

    public static void main(String[] args) {
        System.out.println("5! = " + factorial(5));
        System.out.println("5! = " + factorial(3));
        System.out.println("5! = " + factorial(8));
    }
}
