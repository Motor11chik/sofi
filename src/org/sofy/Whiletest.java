package org.sofy;

//: control/Whiletest java
public class Whiletest {
    private static boolean condition() {
        double random = Math.random();
        boolean result = random < 0.99;
        System.out.print(result + "," + random);
        return result;
    }

    public static void main(String... args) {
        while (condition()) {
            System.out.println("inside 'while' ");
            System.out.println("Exited 'while' ");
        }
    }
}
