import java.util.Locale;
import java.util.Scanner;

public class BhaskarasFormula {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        input.close();

        double delta = Math.pow(b,2) - (4 * a * c);
        if ((2*a==0) || (delta<0)){
            System.out.println("Impossivel calcular");
        }else {
            double r1 = ((-(b) + Math.sqrt(delta)) / (2 * a));
            double r2 = ((-(b) - Math.sqrt(delta)) / (2 * a));
            System.out.printf("R1 = %.5f\n", r1);
            System.out.printf("R2 = %.5f\n", r2);
        }
    }
}