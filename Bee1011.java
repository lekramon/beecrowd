import java.util.Scanner;

public class Bee1011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double R = sc.nextDouble();

        System.out.printf("VOLUME = %.3f%n", 4.0/3 * 3.14159 * R * R * R);
    }
}
