import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class ArraySelectionI {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        DecimalFormat df = new DecimalFormat("0.0");
        Scanner input = new Scanner(System.in);
        double [] numbers = new double[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
            if (numbers[i] <= 10){
                System.out.println("A[" + i + "] = " + df.format(numbers[i]));
            }
        }
    }
}
