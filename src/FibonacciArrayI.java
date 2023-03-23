import java.util.Scanner;

public class FibonacciArrayI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long[] fiboSec = new long[65];
        fiboSec[0] = 0;
        fiboSec[1] = 1;
        fiboSec[2] = 1;

        for (int i = 3; i < fiboSec.length; i++) {
            fiboSec[i] = fiboSec[(i-1)] + fiboSec[(i-2)];
        }

        int nCase = input.nextInt();

        for (int i = 0; i < nCase; i++) {
            int position = input.nextInt();
            System.out.println("Fib("+position+") = "+fiboSec[position]);
        }
    }
}
