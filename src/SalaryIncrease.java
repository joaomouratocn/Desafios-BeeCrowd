import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class SalaryIncrease {
    public static void main(String[] args) {
        double newSalary;
        double adjustmentValue;
        int percent;

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();
        input.close();

        if (salary >= 0.00 && salary <= 400.00){
            adjustmentValue = 0.15 * salary;
            newSalary = salary + adjustmentValue;
            percent = 15;
        } else if (salary >= 400.01 && salary <= 800.00) {
            adjustmentValue = 0.12 * salary;
            newSalary = salary + adjustmentValue;
            percent = 12;
        } else if (salary >= 800.01 && salary <= 1200.00) {
            adjustmentValue = 0.10 * salary;
            newSalary = salary + adjustmentValue;
            percent = 10;
        } else if (salary >= 1200.01 && salary <= 2000) {
            adjustmentValue = 0.07 * salary;
            newSalary = salary + adjustmentValue;
            percent = 7;
        }else {
            adjustmentValue = 0.04 * salary;
            newSalary = salary + adjustmentValue;
            percent = 4;
        }

        System.out.printf("Novo salario: %.2f\n", newSalary);
        System.out.printf("Reajuste ganho: %.2f\n", adjustmentValue);
        System.out.println("Em percentual: " + percent + " %");
    }
}
