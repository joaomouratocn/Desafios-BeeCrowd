import java.util.Scanner;

public class Interval2 {
    public static void main(String[] args) {
        int inInterval = 0;
        int outInterval = 0;

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] values = new int[n];

        for (int i = 0; i < n; i++) {
            values[i] = input.nextInt();
        }
        input.close();

        for(int value:values){
            if(value >= 10 && value <= 20){
                inInterval += 1;
            }else {
                outInterval += 1;
            }
        }

        System.out.println(inInterval + " in");
        System.out.println(outInterval + " out");
    }
}
