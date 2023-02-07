import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();

        for (int i = 1; i <= 10; i++) {
            int result = i * number;
            System.out.println(i + " x " + number + " = " + result);
        }
    }
}
