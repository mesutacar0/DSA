package datastructures.recursion;

public class CallStack {
    public static void method1() {
        method2();
        System.out.println("method1 called");
    }

    public static void method2() {
        method3();
        System.out.println("method2 called");
    }

    public static void method3() {
        method4();
        System.out.println("method3 called");
    }

    public static void method4() {
        System.out.println("method4 called");
    }

    public static void main(String[] args) {
        method1();
    }
}
