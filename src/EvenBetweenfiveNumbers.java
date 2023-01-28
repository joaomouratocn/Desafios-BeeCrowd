import java.util.Scanner;

public class EvenBetweenfiveNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int pairNumbers = 0;

        Scanner input = new Scanner(System.in);
        numbers[0] = input.nextInt();
        numbers[1] = input.nextInt();
        numbers[2] = input.nextInt();
        numbers[3] = input.nextInt();
        numbers[4] = input.nextInt();
        input.close();

        for (int number : numbers){
            if (Math.abs(number) % 2 == 0){
                pairNumbers += 1;
            }
        }

        System.out.println(pairNumbers + " valores pares");
    }
}
