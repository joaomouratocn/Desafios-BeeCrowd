import java.util.Scanner;

public class SumOfConsecutiveOddNumbersIII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int caseTest = 0;
        int result;

        caseTest = input.nextInt();

        while (caseTest != 0){
            result = 0;
            int X = input.nextInt();
            int Y = input.nextInt();

            for (int i = 1; i <= Y;) {
                if (X % 2 != 0){
                    result += X;
                    X += 2;
                    i++;
                }else {
                    X += 1;
                }
            }
            System.out.println(result);
            caseTest --;
        }
    }
}
