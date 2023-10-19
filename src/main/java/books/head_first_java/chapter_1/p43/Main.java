package books.head_first_java.chapter_1.p43;

public class Main {
    public static void main(String[] args) {
        int x = 1;
        while (x <= 3) {
            System.out.print("Doo");
            System.out.print("Bee");
            if (x == 1) {
                System.out.println();
            }
            x = x + 1;
        }
        if (x == 4) {
            System.out.print("Do");
        }
    }
}
