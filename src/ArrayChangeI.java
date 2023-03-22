import java.util.Scanner;

public class ArrayChangeI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[20];
        int lastIndex = numbers.length -1;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            int aux = numbers[i];
            numbers[i] = numbers[(lastIndex - i)];
            numbers[lastIndex - i] = aux;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("N["+i+"] = "+numbers[i]);
        }
    }
}
