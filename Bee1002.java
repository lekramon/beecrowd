import java.util.Scanner;

public class Bee1002 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double N = 3.14159;
        double raio = sc.nextDouble();
        double area = N * (raio * raio);

        System.out.printf("A=%.4f%n", area);

    }
}
