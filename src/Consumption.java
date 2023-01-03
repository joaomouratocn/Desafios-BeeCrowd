import java.util.Locale;
import java.util.Scanner;

public class Consumption {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int km = input.nextInt();
        double fuel = input.nextDouble();
        input.close();

        double media = km / fuel;

        System.out.printf("%.3f km/l\n", media);
    }
}
