import java.util.Scanner;

public class Bee1006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double pesoA = 2.0;
        double pesoB = 3.0;
        double pesoC = 5.0;

        double media = (A * pesoA + B * pesoB + C * pesoC) / (pesoA + pesoB + pesoC);

        System.out.printf("MEDIA = %.1f%n", media);
    }
}
