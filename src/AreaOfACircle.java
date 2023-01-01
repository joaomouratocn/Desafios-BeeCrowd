import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class AreaOfACircle {
    public static void main(String[] args) {
        double pi = 3.14159;
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);
        double raio = input.nextDouble();
        input.close();

        double area = pi * Math.pow(raio, 2);

        System.out.printf("A=%.4f\n",area);
    }
}
