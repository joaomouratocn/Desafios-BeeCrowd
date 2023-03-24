import java.util.Scanner;

public class ArrayFillII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int count = 0;

        for (int i = 0; i < 1000; i++) {
            if (count > (t-1)){
                count = 0;
            }
            System.out.println("N["+i+"] = "+count);
            count++;
        }
    }
}
