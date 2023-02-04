import java.util.Scanner;

public class EvenSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0){
                int result = (int) Math.pow(i,2);
                System.out.println(i + "^2 = " + result);
            }
        }
    }
}
