package books.head_first_java.chapter_4.P107;

import java.sql.SQLOutput;

public class GoodDog {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        this.size = s;
    }

    void bark() {
        if (size > 60) {
            System.out.println("ГАВ");
        } else if (size > 14) {
            System.out.println("Вуф");
        } else {
            System.out.println("Тяф");
        }
    }
}
