import java.util.Scanner;

public class HighestAndPosition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[100];
        int bigger = 0;
        int position = 0;

        for (int i = 0; i < 100; i++) {
            numbers[i] = input.nextInt();
            if (bigger < numbers[i]){
                bigger = numbers[i];
                position = i;
            }
        }
        input.close();

        System.out.println(bigger);
        System.out.println(position + 1);
    }
}
