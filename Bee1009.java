import java.util.Scanner;

public class Bee1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = sc.next();
        double salarioFixo = sc.nextDouble();
        double vendas = sc.nextDouble();

        System.out.printf("TOTAL = R$ %.2f%n", salarioFixo + vendas * 0.15);
    }
}
