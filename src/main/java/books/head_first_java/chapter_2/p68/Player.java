package books.head_first_java.chapter_2.p68;

public class Player {
    private int number = 0;

    public int guess() {
        number = (int) (Math.random() * 10);
        return number;
    }
}
