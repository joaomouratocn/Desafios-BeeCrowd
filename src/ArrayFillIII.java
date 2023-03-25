import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class ArrayFillIII {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        DecimalFormat df = new DecimalFormat("0.0000");
        Scanner input = new Scanner(System.in);
        double[] seq = new double[100];

        seq[0] = input.nextDouble();

        for (int i = 1; i < seq.length; i++) {
            seq[(i)] = seq[(i-1)] / 2;
        }

        for (int i = 0; i < seq.length; i++) {
            System.out.println("N["+i+"] = " + df.format(seq[i]));
        }
    }
}
