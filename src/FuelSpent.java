import java.util.Locale;
import java.util.Scanner;

public class FuelSpent {
    public static void main(String[] args) {
        int kml = 12;
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double spentTime = input.nextDouble();
        double distance = input.nextDouble();
        input.close();

        double result = (spentTime * distance) / kml;

        System.out.printf("%.3f\n",result);
    }
}
