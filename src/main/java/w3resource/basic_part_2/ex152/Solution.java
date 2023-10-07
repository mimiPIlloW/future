package w3resource.basic_part_2.ex152;

public class Solution {
    public void sol(int[] arr) {
        for (int a = 0; a < arr.length - 1; a++) {
            if (arr[a] == arr[a + 1]) {
                System.out.println("Numbers are equal! " + arr[a] + " == " + arr[a + 1]);
            } else {
                System.out.println("Numbers are not equal! " + arr[a] + " == " + arr[a + 1]);
            }
        }
    }
}
