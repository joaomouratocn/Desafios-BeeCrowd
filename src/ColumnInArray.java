import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class ColumnInArray {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0");
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double[][] biArray = new double[12][12];
        double result = 0;
        int column = input.nextInt();
        String operation = input.next();

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                biArray[i][j] = input.nextDouble();
            }
        }

        for (int i = 0; i < 12; i++) {
            result += biArray[i][column];
        }

        if (Objects.equals(operation, "S")){
            System.out.println(df.format(result));
        }else {
            System.out.println(df.format(result/12));
        }
    }
}
