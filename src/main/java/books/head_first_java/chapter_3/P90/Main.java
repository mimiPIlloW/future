package books.head_first_java.chapter_3.P90;

public class Main {
    public static void main(String[] args) {
        int ref;
        int y = 0;

        String[] island = new String[4];
        island[0] = "Бермуды";
        island[1] = "Фиджи";
        island[2] = "Острова";
        island[3] = "Косумель";

        int[] index = new int[4];
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;


        while (y < 4) {
            ref = index[y];
            System.out.println("Острова = " + island[ref]);
            y++;
        }

    }
}
