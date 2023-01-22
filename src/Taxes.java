import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Taxes {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        DecimalFormat df = new DecimalFormat("0.00");

        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();
        input.close();

        if (salary >= 0.00 && salary <= 2000.00) {
            System.out.println("Isento");
        } else if (salary > 2000.01 && salary <= 3000.00) {
            salary = (salary - 2000) * 0.08;
            System.out.println("R$ " + df.format(salary));
        } else if (salary > 3000.01 && salary <= 4500) {
            salary = ((salary - 3000) * 0.18) + 80;
            System.out.println("R$ " + df.format(salary));
        } else {
            salary = ((salary - 4500) * 0.28) + 350;
            System.out.println("R$ " + df.format(salary));
        }
    }
}
