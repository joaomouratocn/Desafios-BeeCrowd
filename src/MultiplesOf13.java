import java.util.Scanner;

public class MultiplesOf13 {
    public static void main(String[] args) {
        int result = 0;
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();

        if (x > y){
            for (int i = y; i <= x; i++) {
                if (i % 13 != 0){
                    result += i;
                }
            }
        }else {
            for (int i = x; i <= y; i++) {
                if (i % 13 != 0){
                    result += i;
                }
            }
        }
        System.out.println(result);
    }
}
