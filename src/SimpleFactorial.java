import java.util.Scanner;

public class SimpleFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int factory = 1;

        for (int i = n; i >= 1; i--) {
            factory = factory * i;
        }

        System.out.println(factory);
    }
}
