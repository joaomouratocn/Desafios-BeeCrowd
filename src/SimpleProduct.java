import java.util.Scanner;

public class SimpleProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        input.close();

        int prod = n1 * n2;

        System.out.println("PROD = "+prod);
    }
}
