package leetcode.ex1;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = new int[]{3, 2, 3};
        int[] result = solution.twoSum(arr, 6);
        System.out.println(Arrays.toString(result));
    }
}
