package leetcode.ex14;

public class LongestCommonPrefix {
    public static void main(String[] args) {
//        Solution solution = new Solution();
        Solution1 solution = new Solution1();
        String[] arr = new String[]{"flower","flow","flight"};
        String result = String.valueOf(solution.sol(arr));
        System.out.print(result);
    }
}
