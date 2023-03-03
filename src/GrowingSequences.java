import java.util.Scanner;

public class GrowingSequences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int entryValue = input.nextInt();
        while (entryValue != 0){
            for (int i = 1; i <= entryValue; i++) {
                if(i == entryValue){
                    System.out.println(i);
                }else {
                    System.out.print(i + " ");
                }
            }
            entryValue = input.nextInt();
        }
    }
}
