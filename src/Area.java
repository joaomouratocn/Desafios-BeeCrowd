import java.util.Locale;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double pi = 3.14159;

        Scanner input = new Scanner(System.in);
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();
        input.close();

        double areaTriangle = (A * C) / 2;
        double circle = pi * Math.pow(C, 2);
        double areaTrapezium = (A + B) * C / 2;
        double areaSquare = Math.pow(B, 2);
        double areaRectangle = A * B;


        System.out.printf("TRIANGULO: %.3f\n",areaTriangle);
        System.out.printf("CIRCULO: %.3f\n",circle);
        System.out.printf("TRAPEZIO: %.3f\n",areaTrapezium);
        System.out.printf("QUADRADO: %.3f\n", areaSquare);
        System.out.printf("RETANGULO: %.3f\n", areaRectangle);
    }
}
