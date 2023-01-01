import java.util.Scanner;

public class ExtremelyBasic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        input.close();

        int result = n1 + n2;

        System.out.println("X = " + result);
    }
}
