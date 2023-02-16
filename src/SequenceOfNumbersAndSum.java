import java.util.Scanner;

public class SequenceOfNumbersAndSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (input.hasNextInt()){
            int m = input.nextInt();
            int n = input.nextInt();
            if (m <= 0 || n <= 0){break;}
            else {
                int totSum = 0;

                if (m > n){
                    for (int i = n; i <= m; i++) {
                        totSum += i;
                        System.out.print(i + " ");
                    }
                }else{
                    for (int i = m; i <= n; i++) {
                        totSum += i;
                        System.out.print(i + " ");
                    }
                }
                System.out.println("Sum=" + totSum);
            }
        }
    }
}
