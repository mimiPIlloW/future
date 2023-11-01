package leetcode.ex20;

public class Solution {
    public boolean sol(String[] s) {
        boolean yes = false;
        for (int a = 0; a < s.length; a++) {
            for (int d = 0; d < s[a].length(); d++) {
                char symbol = s[a].charAt(d);
                int f = d;
                switch (symbol) {
                    case '(':
                        while (s[a].charAt(f) != ')') {
                            f++;
                        }
                        if (s[a].charAt(d) == ')') {
                            yes = true;
                        }else {
                            return false;
                        }
                        break;
                    case '{':
                        while (s[a].charAt(f) != '}') {
                            f++;
                        }
                        if (s[a].charAt(f) == '}') {
                            yes = true;
                        }else {
                            return false;
                        }
                        break;
                    case '[':
                        while (s[a].charAt(f) != ']') {
                            f++;
                        }
                        if (s[a].charAt(f) == ']') {
                            yes = true;
                        }else {
                            return false;
                        }
                        break;
                    default:
                        switch (s[a].charAt(a)) {
                            case ')':
                            case '}':
                            case ']':
                        }
                }
            }
        }
        return yes;
    }
}
