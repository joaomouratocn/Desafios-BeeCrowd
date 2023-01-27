import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class PositivesAndAverage {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        DecimalFormat df = new DecimalFormat("0.0");

        int countPositiveNumbers = 0;
        double sumPositiveNumbers = 0;
        double mediaPositiveNumbers;
        double[] numbers = new double[6];


        Scanner input = new Scanner(System.in);
        numbers[0] = input.nextDouble();
        numbers[1] = input.nextDouble();
        numbers[2] = input.nextDouble();
        numbers[3] = input.nextDouble();
        numbers[4] = input.nextDouble();
        numbers[5] = input.nextDouble();
        input.close();

        for (double number : numbers) {
            if (number > 0) {
                countPositiveNumbers += 1;
                sumPositiveNumbers += number;
            }
        }

        mediaPositiveNumbers = sumPositiveNumbers / countPositiveNumbers;

        System.out.println(countPositiveNumbers + " valores positivos");
        System.out.println(df.format(mediaPositiveNumbers));
    }
}
