package acmp.id0001.a;

import java.util.Scanner;

public class APlusB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 int number");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result = a + b;
        System.out.println("Result " + result);
    }
}
