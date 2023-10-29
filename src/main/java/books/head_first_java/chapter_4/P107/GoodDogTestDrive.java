package books.head_first_java.chapter_4.P107;

public class GoodDogTestDrive {
    public static void main(String[] args) {
        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(15);
        GoodDog three = new GoodDog();
        three.setSize(5);

        System.out.println("One " + one.getSize());
        System.out.println("Two " + two.getSize());
        System.out.println("Three " + three.getSize());
        one.bark();
        two.bark();
        three.bark();
    }
}
