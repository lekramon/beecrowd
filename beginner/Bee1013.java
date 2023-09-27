package beginner;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Bee1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int maiorAB = ((A + B + abs(A - B)) / 2);
        int maiorC = ((maiorAB + C + abs(maiorAB - C)) / 2);

        System.out.println(maiorC + " eh o maior");
    }
}
