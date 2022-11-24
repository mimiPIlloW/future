package codeforces.id4a;

import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int watermelon = scanner.nextInt();
        if(watermelon % 2 == 0) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
