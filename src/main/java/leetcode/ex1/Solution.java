package leetcode.ex1;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] t = new int[2];
        outerloop:
        for (int a = 0; a < nums.length; a++) {
            for (int b = a + 1; b < nums.length; b++) {
                if (nums[a] + nums[b] == target) {
                    t[0] = a;
                    t[1] = b;
                    break outerloop;
                }
            }
        }
        return t;
    }
}