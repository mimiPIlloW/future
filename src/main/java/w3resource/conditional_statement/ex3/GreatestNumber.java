package w3resource.conditional_statement.ex3;

import java.util.Scanner;

public class GreatestNumber {
    protected static final String FIRST_NUMBER = "Input the 1st number: ";
    protected static final String FIRST_SECOND = "Input the 2nd number: ";
    protected static final String FIRST_THIRD = "Input the 3rd number: ";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(FIRST_NUMBER);
        int first = scanner.nextInt();

        System.out.print(FIRST_SECOND);
        int second = scanner.nextInt();

        System.out.print(FIRST_THIRD);
        int third = scanner.nextInt();

        int[] arr = new int[]{first, second, third};

        int len = arr.length;

        for (int a = 0; a < len; a++) {
            for (int b = 0; b < len - 1; b++) {
                if (arr[b] < arr[b + 1]) {
                    int f = arr[b];
                    arr[b] = arr[b + 1];
                    arr[b + 1] = f;
                }
            }
        }

        int e = 1;
        for (int i : arr) {
            System.out.println("The " + e + "st number: " + i);
            e++;
        }
    }
}
