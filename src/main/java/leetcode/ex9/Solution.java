package leetcode.ex9;

import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int out = x;
        List<Integer> nums = new ArrayList<>();
        while (x != 0) {
            nums.add(x % 10);
            x /= 10;
        }
        long n = 0;
        for (int d : nums) {
            n = 10 * n + d;
        }
        return n == out;
    }
}
