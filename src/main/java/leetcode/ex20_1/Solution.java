package leetcode.ex20_1;

public class Solution {
    public boolean sol(String s) {
        boolean yes = false;
        for (int d = 0; d < s.length(); d++) {
            char symbol = s.charAt(d);
            int f = d;
            if (s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}'){
                yes = false;
                break;
            }
            switch (symbol) {
                case '(':
                    while (s.charAt(f) != ')') {
                        f++;
                    }
                    if (s.charAt(f) == ')') {
                        yes = true;
                    } else {
                        return false;
                    }
                    break;
                case '{':
                    while (s.charAt(f) != '}') {
                        f++;
                    }
                    if (s.charAt(f) == '}') {
                        yes = true;
                    } else {
                        return false;
                    }
                    break;
                case '[':
                    while (s.charAt(f) != ']') {
                        f++;
                    }
                    if (s.charAt(f) == ']') {
                        yes = true;
                    } else {
                        return false;
                    }
                    break;
                default:
                    switch (s.charAt(f)) {
                        case ')':
                        case '}':
                        case ']':
                    }
            }
        }
        return yes;
    }
}
