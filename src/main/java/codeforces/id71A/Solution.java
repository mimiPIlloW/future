package codeforces.id71A;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    void result(int a) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> text = new ArrayList<>();
        for (int b = 0; b < a; b++) {
            text.add(scanner.next());
        }
        for (int c = 0; c < text.size(); c++) {
            if (text.get(c).length() > 4) {
                System.out.println(text.get(c).charAt(0) + "" + (text.get(c).length() - 2) + "" + text.get(c).charAt(text.get(c).length() - 1));
            } else {
                System.out.println(text.get(c));
            }
        }
    }
}