package w3resource.array.ex1;

import java.util.Arrays;

public class Solution {
    public void sol(int[] arr) {
        for (int a = 0; a < arr.length - 1; a++) {
            for (int b = 0; b < arr.length -1; b++) {
                if (arr[b] < arr[b + 1]) {
                    int temp = arr[b];
                    arr[b] = arr[b + 1];
                    arr[b + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
