import java.util.Scanner;

public class SquaredAndCubic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberLines = input.nextInt();

        for (int i = 1; i <= numberLines; i++) {
            System.out.println(i + " " + (int)Math.pow(i,2) + " " + (int)Math.pow(i,3));
        }
    }
}
