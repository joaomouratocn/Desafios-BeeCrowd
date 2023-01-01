import java.util.Scanner;

public class Difference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int D = input.nextInt();
        input.close();

        int difference = A * B - C * D;

        System.out.println("DIFERENCA = " + difference);
    }
}
