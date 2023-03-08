import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);
        int sumAge = 0;
        int count = 0;
        int entryAge;

        entryAge = input.nextInt();

        while (entryAge >= 0){
            sumAge += entryAge;
            count++;
            entryAge = input.nextInt();
        }

        double result = (double) sumAge / (double) count;

        System.out.println(df.format(result));
    }
}
