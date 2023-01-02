import java.util.Locale;
import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double pi = 3.14159;

        Scanner input = new Scanner(System.in);
        double ray = input.nextDouble();
        input.close();

        double volume = (4.0 / 3) * pi * Math.pow(ray, 3);

        System.out.printf("VOLUME = %.3f\n", volume);
    }
}
