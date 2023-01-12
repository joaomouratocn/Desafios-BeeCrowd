import java.util.Scanner;

public class SimpleSort {
    public static void main(String[] args) {
        int[] nOrder = new int[3];
        int[] nOrderOrign = new int[3];

        Scanner input = new Scanner(System.in);
        nOrder[0] = input.nextInt();
        nOrder[1] = input.nextInt();
        nOrder[2] = input.nextInt();
        input.close();

        nOrderOrign[0] = nOrder[0];
        nOrderOrign[1] = nOrder[1];
        nOrderOrign[2] = nOrder[2];

        for (int i = 0; i < nOrder.length - 1; i++) {
            for (int j = i+1; j < nOrder.length; j++) {
                if (nOrder[i] > nOrder[j]){
                    int temp = nOrder[i];
                    nOrder[i] = nOrder[j];
                    nOrder[j] = temp;
                }
            }
        }

        for (int i = 0; i < nOrder.length; i++) {
            System.out.println(nOrder[i]);
        }
        System.out.printf("\n");
        for (int i = 0; i < nOrderOrign.length; i++) {
            System.out.println(nOrderOrign[i]);
        }
    }
}
