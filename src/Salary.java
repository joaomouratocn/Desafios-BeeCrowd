import java.util.Locale;
import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);
        int numberFun = input.nextInt();
        int workHours = input.nextInt();
        double salaryHour = input.nextDouble();
        input.close();

        double salaryMonth = workHours * salaryHour;

        System.out.println("NUMBER = " + numberFun);
        System.out.printf("SALARY = U$ %.2f\n",salaryMonth);
    }
}
