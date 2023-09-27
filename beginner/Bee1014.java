package beginner;

import java.util.Scanner;

public class Bee1014 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        double Y = sc.nextDouble();
        double averageConsumption = (X / Y);

        String averageConsumptionFormatted = String.format("%.3f", averageConsumption);

        System.out.println(averageConsumptionFormatted + " km/l");
    }
}
