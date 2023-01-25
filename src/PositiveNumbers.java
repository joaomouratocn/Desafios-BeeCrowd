import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        int totPositive = 0;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i <= 5; i++) {
            double value = input.nextDouble();

            if (value > 0){
                totPositive += 1;
            }
        }
        input.close();
        System.out.println(totPositive + " valores positivos");
    }
}
