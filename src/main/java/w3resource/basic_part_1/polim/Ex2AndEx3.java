package w3resource.basic_part_1.polim;

import java.util.Scanner;

public class Ex2AndEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        Ex2 ex2 = new Ex2();
        Ex2 ex3 = new Ex3();
        System.out.println(ex2.retNum(a,b));
        ex2.out();
        System.out.println(ex3.retNum(a,b));
        ex3.out();
    }
}
