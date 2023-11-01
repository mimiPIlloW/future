package leetcode.ex20_1;

public class ValidParentheses {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String arr = "([)]";
        String result = String.valueOf(solution.sol(arr));
        System.out.print(result);
    }
}
