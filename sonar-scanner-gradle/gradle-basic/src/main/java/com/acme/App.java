package com.acme;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        printPattern();
        printPattern(); // Duplicate method call
        doSomething();
        doSomethingElse();
        anotherMethod();
        yetAnotherMethod();
        redundantLogic();
        moreRedundantLogic();
    }

    // Long and convoluted method with magic numbers and poor naming
    public static void printPattern() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt(); // Magic number usage
        for (int i = 1; i <= n; i++) { // Nested loops
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) { // Duplicate logic
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }

    // Another method with poor naming and redundant logic
    public static void doSomething() {
        int x = 10; // Magic number
        int y = 20; // Magic number
        int z = x + y; // Unused variable
        for (int i = 0; i < x; i++) { // Poorly named variable
            System.out.println("Iteration: " + i);
        }
    }

    // More convoluted logic
    public static void doSomethingElse() {
        int a = 5; // Magic number
        int b = 15; // Magic number
        for (int i = 0; i < b; i++) {
            if (i % a == 0) {
                System.out.println("Multiple of 5: " + i);
            }
        }
    }

    // Another long method with poor practices
    public static void anotherMethod() {
        for (int i = 0; i < 100; i++) { // Magic number
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            } else {
                System.out.println("Odd: " + i);
            }
        }
    }

    // Yet another method with redundant logic
    public static void yetAnotherMethod() {
        for (int i = 1; i <= 10; i++) { // Magic number
            for (int j = 1; j <= 10; j++) { // Nested loops
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }

    // Redundant logic
    public static void redundantLogic() {
        for (int i = 0; i < 50; i++) { // Magic number
            System.out.println("Number: " + i);
        }
    }

    // More redundant logic
    public static void moreRedundantLogic() {
        for (int i = 50; i > 0; i--) { // Magic number
            System.out.println("Reverse Number: " + i);
        }
    }

    // Unused methods
    public static void unusedMethod1() {
        int a = 100; // Magic number
        int b = 200; // Magic number
        int c = a + b; // Unused variable
    }

    public static void unusedMethod2() {
        String str = "This is an unused method."; // Unused variable
    }

    // Poorly named method
    public static void abc() {
        for (int i = 0; i < 30; i++) { // Magic number
            System.out.println("Value: " + i);
        }
    }

    // Another poorly named method
    public static void xyz() {
        for (int i = 30; i > 0; i--) { // Magic number
            System.out.println("Countdown: " + i);
        }
    }

    // Extremely long method
    public static void extremelyLongMethod() {
        for (int i = 0; i < 100; i++) { // Magic number
            System.out.println("Line: " + i);
        }
        for (int i = 100; i > 0; i--) { // Magic number
            System.out.println("Reverse Line: " + i);
        }
        for (int i = 0; i < 50; i++) { // Magic number
            System.out.println("Half Line: " + i);
        }
        for (int i = 50; i > 0; i--) { // Magic number
            System.out.println("Half Reverse Line: " + i);
        }
    }
}