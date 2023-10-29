package leetcode.ex13;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int a = solution.romanToInt("MCMXCIV");
        System.out.println(a);
    }
}

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> symbolValue = new HashMap<>();
        symbolValue.put('I', 1);
        symbolValue.put('V', 5);
        symbolValue.put('X', 10);
        symbolValue.put('L', 50);
        symbolValue.put('C', 100);
        symbolValue.put('D', 500);
        symbolValue.put('M', 1000);

        int result = 0;
        int i = 0;
        try {
            for (; i < s.length(); i++) {
                int value = symbolValue.get(s.charAt(i));
                int nextValue = symbolValue.get(s.charAt(i + 1));
                if (value < nextValue) {
                    result += nextValue - value;
                    i++;
                } else {
                    result += value;
                }
            }
        } catch (Exception e) {
            result += symbolValue.get(s.charAt(i));
        }
        return result;
    }
}
