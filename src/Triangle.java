import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        DecimalFormat df = new DecimalFormat("0.0");

        Scanner input = new Scanner(System.in);
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();
        input.close();

        if (A < (B+C) && B < (A+C) && C < (B+A)){
            double periTri = A + B + C;
            System.out.println("Perimetro = " + df.format(periTri));
        }else {
            double areaTra = ((A + B) * C) / 2;
            System.out.println("Area = " + df.format(areaTra));
        }
    }
}
