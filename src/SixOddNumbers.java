import java.util.Scanner;

public class SixOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();

        for (int i = number; i < number + 12; i++) {
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
