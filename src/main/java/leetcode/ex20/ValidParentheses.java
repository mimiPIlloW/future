package leetcode.ex20;

public class ValidParentheses {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] arr = new String[]{"({})","{}","{"};
        String result = String.valueOf(solution.sol(arr));
        System.out.print(result);
    }
}
