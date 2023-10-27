package acmp.id0008;

import com.sun.jdi.event.ExceptionEvent;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[0];
        try {
            arr = new int[3];
            for (int a = 0; a < arr.length; a++) {
                arr[a] = scanner.nextInt();
            }
        } catch (Exception e) {
            System.out.println("More");
        }
        solution(arr);
    }

    static public void solution(int[] arr) {
        try {
            if (arr[0] * arr[1] == arr[2]) {
                System.out.println("YES");
            } else {
                System.out.println("No");
            }
        } catch (Exception e) {
            System.out.println("Here");
        }
    }
}
