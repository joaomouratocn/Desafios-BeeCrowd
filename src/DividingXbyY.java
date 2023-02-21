import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

    public class DividingXbyY {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        DecimalFormat df = new DecimalFormat("0.0");
        Scanner input = new Scanner(System.in);

        int totTest = input.nextInt();

        for (int i = 0; i < totTest; i++) {
            double x = input.nextInt();
            double y = input.nextInt();

            if (y == 0){
                System.out.println("divisao impossivel");
            }else {
                double result = x / y;
                System.out.println(df.format(result));
            }
        }
    }
}
