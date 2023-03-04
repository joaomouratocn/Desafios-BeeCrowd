import java.util.Scanner;

public class SummingConsecutiveIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int N = input.nextInt();
        int result  = 0;

        while (N <= 0){
           N = input.nextInt();
        }

        for (int i = 1; i <= N; i++) {
            result += A;
            A++;
        }
        System.out.println(result);
    }
}
