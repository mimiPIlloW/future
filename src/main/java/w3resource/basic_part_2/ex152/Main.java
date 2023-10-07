package w3resource.basic_part_2.ex152;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input 1 ");
        int a = scanner.nextInt();
        System.out.print("Input 2 ");
        int b = scanner.nextInt();
        System.out.print("Input 3 ");
        int c = scanner.nextInt();
        System.out.print("Input 4 ");
        int d = scanner.nextInt();
        int[] arr = new int[]{a, b, c, d};
        Solution solution = new Solution();
        solution.sol(arr);
    }
}
