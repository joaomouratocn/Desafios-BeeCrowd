import java.util.Locale;
import java.util.Scanner;

public class Average1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double notaA = input.nextDouble();
        double notaB = input.nextDouble();
        input.close();

        double media = ((notaA * 3.5) + (notaB * 7.5)) / 11;

        System.out.printf("MEDIA = %.5f\n", media);
    }
}
