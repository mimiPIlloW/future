package w3resource.array.ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the number of digits");
        int[] arr = new int[scanner.nextInt()];
        System.out.println("Enter please " + arr.length + " number of digits");
        for (int a = 0; a < arr.length; a++) {
            String string = String.valueOf(Integer.parseInt(scanner.next()));
            System.out.println((a + 1) + " numbers is " + string);
            arr[a] = Integer.parseInt(string);
        }
        Solution solution = new Solution();
        solution.sol(arr);
    }
}


