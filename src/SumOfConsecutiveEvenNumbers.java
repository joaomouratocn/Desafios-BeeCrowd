import java.util.Scanner;

public class SumOfConsecutiveEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int entryNumber = input.nextInt();

        while (entryNumber != 0){
            int result = 0;
            for (int i = 0; i < 5;) {
                if (entryNumber % 2 == 0){
                    result += entryNumber;
                    entryNumber +=2;
                    i++;
                }else {entryNumber++;}
            }
            System.out.println(result);
            entryNumber = input.nextInt();
        }
    }
}
