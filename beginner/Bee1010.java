package beginner;

import java.util.Scanner;

public class Bee1010 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codigo1 = sc.nextInt();
        int quantidadePecas1 = sc.nextInt();
        double valorPecas1 = sc.nextDouble();

        int codigo2 = sc.nextInt();
        int quantidadePecas2 = sc.nextInt();
        double valorPecas2 = sc.nextDouble();

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", quantidadePecas1 * valorPecas1 + quantidadePecas2 * valorPecas2);
    }
}
