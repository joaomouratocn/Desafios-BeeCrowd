import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class LineInArray {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double[][] biArray = new double[12][12];
        double result = 0;
        int line = input.nextInt();
        String operation = input.next();

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                biArray[i][j] = input.nextDouble();
            }
        }

        for (int i = 0; i < 12; i++) {
            result += biArray[line][i];
        }

        if (Objects.equals(operation, "S")){
            System.out.println(result);
        }else {
            System.out.println(result/12);
        }
    }
}
