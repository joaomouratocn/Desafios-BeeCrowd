import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int caseTest = input.nextInt();

        while (caseTest != 0){
            int count = 0;
            int numberCalc = input.nextInt();
            for (int i = 1; i <= numberCalc; i++) {
                if (numberCalc % i == 0){
                    count++;
                }
            }
            if (count == 2){
                System.out.println(numberCalc + " eh primo");
            }else {
                System.out.println(numberCalc + " nao eh primo");
            }
            caseTest--;
        }
    }
}
