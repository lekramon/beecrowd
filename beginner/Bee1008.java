package beginner;

import java.util.Scanner;

public class Bee1008 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        int horas = sc.nextInt();
        double salario = sc.nextDouble();

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f%n", horas * salario);
    }
}
