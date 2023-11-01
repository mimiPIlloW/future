package leetcode.ex14;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] arr = new String[]{"a","aca","accb","b"};
        String result = String.valueOf(solution.sol(arr));
        System.out.print(result);
    }
}
