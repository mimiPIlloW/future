package acmp.id108.a;

import java.util.Scanner;

public class NotDeafPhone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input ");
        int input = scanner.nextInt();

        int sum = 1;
        while (sum > 0) {
            if (input > 0 && input <= 100) {
                int output = input;
                System.out.println("Output " + output);
                sum = 0;
            } else {
                System.out.print("Error please enter ");
                input = scanner.nextInt();
            }
        }
    }
}
