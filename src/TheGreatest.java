import java.util.Scanner;

public class TheGreatest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        input.close();

        int resultAB = (A + B + Math.abs(A - B)) / 2;
        int result = (resultAB + C + Math.abs(resultAB - C)) / 2;

        System.out.printf(result + " eh o maior\n");
    }
}
