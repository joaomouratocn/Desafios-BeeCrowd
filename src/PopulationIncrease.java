import java.util.Locale;
import java.util.Scanner;

public class PopulationIncrease {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int caseTest = input.nextInt();
        int PA, PB, anos;
        double G1, G2;
        for (int i = 1; i <= caseTest; i++) {
            anos = 0;
            PA = input.nextInt();
            PB = input.nextInt();
            G1 = input.nextDouble();
            G2 = input.nextDouble();
            while (PB >= PA) {
                PA += (PA * G1) / 100;
                PB += (PB * G2) / 100;
                anos++;
                if (anos > 100) {
                    break;
                }
            }
            if (anos > 100) {
                System.out.println("Mais de 1 seculo.");
            } else {
                System.out.println(anos + " anos.");
            }
        }
    }
}
