import java.util.Scanner;

public class SumOfConsecutiveOddNumbersI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        input.close();

        int result = 0;

        if(x > y){
            for (int i = y+1; i < x; i++) {
                if (i % 2 != 0){
                    result += i;
                }
            }
        }else {
            for (int i = x+1; i < y; i++) {
                if (i % 2 != 0){
                    result += i;
                }
            }
        }

        System.out.println(result);
    }
}
