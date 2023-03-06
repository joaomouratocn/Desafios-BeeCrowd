import java.util.Scanner;

public class EasyFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amountNumbers = input.nextInt();

        int seq = 0;
        int n1 = 1;
        int n2 = 1;

        System.out.print(seq + " " + n1 + " " + n2);
        for (int i = 4; i <= amountNumbers ; i++) {
            seq = (n1 + n2);
            n2 = n1;
            n1 = seq;
            System.out.print(" " + seq);
        }
        System.out.println();
    }
}
