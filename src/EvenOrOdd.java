import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int entryAmount = input.nextInt();
        int[] numbers = new int[entryAmount];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0){
                System.out.println("NULL");
            } else if (numbers[i] % 2 == 0 && numbers[i] > 0 ) {
                System.out.println("EVEN POSITIVE");
            }else if (numbers[i] % 2 == 0 && numbers[i] < 0){
                System.out.println("EVEN NEGATIVE");
            } else if (numbers[i] % 2 != 0 && numbers[i] > 0) {
                System.out.println("ODD POSITIVE");
            }else {
                System.out.println("ODD NEGATIVE");
            }
        }
    }
}
