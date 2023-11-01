package leetcode.ex14;

public class Solution {
    public String sol(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int length = strs.length;
        if (length <= 1){
            return strs[0];
        }
        String f = "";
        String finalR = "";
        String result = "";
        String result1 = "";
        String first = "";
        try {
            for (int a = 0; a < length; a++) {
                if(result.length() == 1 && strs.length == 0){
                    return result;
                }
                finalR = result;
                result = "";
                first = strs[a];
                String second = strs[a + 1];
                if (second.length() <= 0 || first.charAt(0) != second.charAt(0)) {
                    return "";
                }
                try {
                    if(finalR.length() == 1){
                        return finalR;
                    }
                    for (int b = 0; b < first.length(); b++) {
                        if (first.charAt(b) == second.charAt(b)) {
                            result += String.valueOf(first.charAt(b));
                        }else {
                            break;
                        }
                    }
                }catch (Exception e){
                    for (int b = 0; b < result.length(); b++) {
                        if (result1 == ""){
                            result1 = result;
                        }
                        if (result.charAt(b) == result1.charAt(b)) {
                            finalR += String.valueOf(first.charAt(b));
                        }
                    }
                }
            }
        }catch (Exception e){
            if (finalR.length() == 2){
                return finalR;
            }
            for (int b = 0; b < first.length(); b++) {
                if (finalR.length() == 1){
                    return finalR;
                }
                try {
                    if (first.charAt(b) == finalR.charAt(b)) {
                        f += String.valueOf(first.charAt(b));
                    }
                }catch (Exception a){
                    return "";
                }
            }
        }
        return f;
    }
}
