package w3resource.basic_part_1.id3;

import java.util.Scanner;

public class AShareB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter please 2 numbers");
        int arr[] = new int[]{scanner.nextInt(), scanner.nextInt()};
        System.out.println(arr[0]/arr[1]);
    }
}
