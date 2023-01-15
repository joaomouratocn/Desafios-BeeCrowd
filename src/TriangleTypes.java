import java.util.Locale;
import java.util.Scanner;

public class TriangleTypes {
    public static void main(String[] args) {
        double[] numbers = new double[3];
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);
        numbers[0] = input.nextDouble();
        numbers[1] = input.nextDouble();
        numbers[2] = input.nextDouble();
        input.close();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]){
                    double temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        double result = Math.pow(numbers[1], 2) + Math.pow(numbers[2], 2);

        if (numbers[0] >= numbers[1] + numbers[2]){
            System.out.println("NAO FORMA TRIANGULO");
        } else if (Math.pow(numbers[0], 2) == result) {
            System.out.println("TRIANGULO RETANGULO");
        } else if (Math.pow(numbers[0], 2) > result) {
            System.out.println("TRIANGULO OBTUSANGULO");
        } else if (Math.pow(numbers[0], 2) < result) {
            System.out.println("TRIANGULO ACUTANGULO");
        }


        if (numbers[0] == numbers[1] && numbers[0] == numbers[2]) {
            System.out.println("TRIANGULO EQUILATERO");
        } else if (numbers[0] == numbers[1] || numbers[0] == numbers[2] || numbers[1] == numbers[2]) {
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
}
