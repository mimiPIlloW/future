package books.head_first_java.chapter_2.p68;

public class GuessGame {
    Player p1 = new Player();
    Player p2 = new Player();
    Player p3 = new Player();

    public void startGame() {

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Загадал число от 0 до 9");

        while (true) {
            System.out.println("Число" + " " + targetNumber);

            int quessp1 = p1.guess();
            System.out.println("Первый" + " " + quessp1);
            int quessp2 = p2.guess();
            System.out.println("Второй" + " " + quessp2);
            int quessp3 = p3.guess();
            System.out.println("Третий" + " " + quessp3);

            if (quessp1 == targetNumber) {
                p1isRight = true;
            }
            if (quessp2 == targetNumber) {
                p2isRight = true;
            }
            if (quessp3 == targetNumber) {
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("Есть победитель");
                if (p1isRight) {
                    System.out.println("Первый" + " " + p1isRight + " число " + quessp1);
                } else if (p2isRight) {
                    System.out.println("Второй" + " " + p2isRight + " число " + quessp2);
                } else {
                    System.out.println("Третий" + " " + p3isRight + " число " + quessp3);
                }
                break;
            } else {
                System.out.println("Пробовать снова");
            }
        }
    }
}
