package w3resource.conditional_statement.ex2;

public class Answer {
    public void answer(int a, int b, int c) {
        double D = Math.pow(b, 2) - 4 * a * c;
        if (D < 0) {
            System.out.println("No real roots");
        } else if (D == 0) {
            System.out.println((b / (2 * a)));
        } else {
            double x1 = (-b + Math.sqrt(D)) / 2 * a;
            double x2 = (-b - Math.sqrt(D)) / 2 * a;
            System.out.println(x1);
            System.out.println(x2);
        }
    }
}
