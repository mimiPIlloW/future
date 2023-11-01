package leetcode.ex14;

public class Solution1 {
    public String sol(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String pref = strs[0];
        for (int a = 1; a < strs.length; a++) {
            String nextPref = strs[a];
            int par = 0;
            while (par < pref.length() && par < nextPref.length() && pref.charAt(par) == nextPref.charAt(par)){
                par++;
            }
            pref = pref.substring(0,par);
            if (pref.length() == 0){
                return "";
            }
        }
        return pref;
    }
}