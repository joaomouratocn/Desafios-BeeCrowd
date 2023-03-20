import java.util.Scanner;

public class ArrayFillI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = new int[10];

        int entryNumber = input.nextInt();

        list[0] = entryNumber;

        for (int i = 1; i < list.length; i++) {
            list[i] = entryNumber * 2;
            entryNumber = list[i];
        }

        for (int i = 0; i < list.length; i++) {
            System.out.println("N["+i+"] = "+list[i]);
        }
    }
}
