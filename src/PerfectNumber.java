import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int caseTest = input.nextInt();

        while (caseTest != 0){
            int entryNumber = input.nextInt();
            int sum  = 0;
            for (int i = 1; i < entryNumber; i++) {
                if (entryNumber % i == 0) {
                    sum += i;
                }
            }
            if(sum == entryNumber){
                System.out.println(entryNumber + " eh perfeito");
            }else {
                System.out.println(entryNumber + " nao eh perfeito");
            }
            caseTest--;
        }
    }
}
