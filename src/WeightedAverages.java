import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class WeightedAverages {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        DecimalFormat df = new DecimalFormat("0.0");
        Scanner input = new Scanner(System.in);

        int amountCaseTest = input.nextInt();

        for (int i = 0; i < amountCaseTest; i++) {

            double n1 = input.nextDouble();
            double n2 = input.nextDouble();
            double n3 = input.nextDouble();

            double result = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;
            System.out.println(df.format(result));
        }
        input.close();
    }
}
