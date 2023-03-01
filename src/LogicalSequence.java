import java.util.Scanner;

public class LogicalSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int entryNumber = input.nextInt();

        for (int i = 1; i <= entryNumber; i++) {
            System.out.println(i + " " + (i * i) + " " + (i * i * i));
            System.out.println(i + " " + ((i * i) + 1) + " " + ((i * i * i) +1));
        }
    }
}
