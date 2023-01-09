import java.util.Locale;
import java.util.Scanner;

public class Snack {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        input.close();

        double total = switch (x) {
            case 1 -> y * 4.00;
            case 2 -> y * 4.50;
            case 3 -> y * 5.00;
            case 4 -> y * 2.00;
            case 5 -> y * 1.50;
            default -> 0;
        };

        System.out.printf("Total: R$ %.2f\n", total);
    }
}
