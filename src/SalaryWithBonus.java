import java.util.Locale;
import java.util.Scanner;

public class SalaryWithBonus {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);
        String funName = input.next();
        double salary = input.nextDouble();
        double totSales = input.nextDouble();
        input.close();

        double salaryWithBonus = 0.15 * totSales + salary;

        System.out.printf("TOTAL = R$ %.2f\n",salaryWithBonus);
    }
}
