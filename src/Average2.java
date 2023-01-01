import java.util.Locale;
import java.util.Scanner;

public class Average2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double notaA = input.nextDouble();
        double notaB = input.nextDouble();
        double notaC = input.nextDouble();
        input.close();

        double media = ((notaA * 2) + (notaB * 3) + (notaC * 5)) /10;

        System.out.printf("MEDIA = %.1f\n",media);
    }
}
