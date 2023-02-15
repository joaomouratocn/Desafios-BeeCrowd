import java.util.Scanner;

public class SumOfConsecutiveOddNumbersII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nTest = input.nextInt();
        int totSum;

        for (int i = 0; i < nTest; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            totSum = 0;

            if (y > x){
                for (int j = x+1; j < y; j++) {
                    if (j % 2 != 0){
                        totSum += j;
                    }
                }
            }else {
                for (int j = y+1; j < x; j++) {
                    if (j % 2 != 0){
                        totSum += j;
                    }
                }

            }
            System.out.println(totSum);
        }
    }
}
