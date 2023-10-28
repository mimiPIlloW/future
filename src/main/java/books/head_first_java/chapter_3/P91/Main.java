package books.head_first_java.chapter_3.P91;

public class Main {
    double area;
    int height;
    int length;

    public static void main(String[] args) {
        int x = 0;
        Main[] mains = new Main[4];
        while (x < 4) {
            mains[x] = new Main();
            mains[x].height = (x + 1) * 2;
            mains[x].length = x + 4;
            mains[x].setArea();
            System.out.print("Треугольник " + x + " зона");
            System.out.println("= " + mains[x].area);
            x++;
        }
        int y = x;
        Main t5 = mains[2];
        mains[2].area = 343;
        System.out.print("y = " + y);
        System.out.println(", зона t5 = " + t5.area);
    }

    void setArea() {
        area = (height * length) / 2;
    }
}
