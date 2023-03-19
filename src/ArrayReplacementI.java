import java.sql.Array;
import java.util.Scanner;

public class ArrayReplacementI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inputList = new int[10];

        for (int i = 0; i < inputList.length; i++) {
            int entryNumber = input.nextInt();
            if (entryNumber <= 0){
                inputList[i] = 1;
            }else{
                inputList[i] = entryNumber;
            }
        }

        for (int i = 0; i < inputList.length; i++) {
            System.out.println("X["+i+"] = "+inputList[i]);
        }
    }
}
