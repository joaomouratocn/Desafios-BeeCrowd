import java.util.Scanner;

public class ArrayFillIV {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] par = new int[5];
        int[] odd = new int[5];
        int X, countPar = 0, countOdd = 0;
        for (int i = 0; i < 15; i++) {
            X = input.nextInt();

            if (X % 2 == 0) {
                par[countPar] = X;
                countPar++;
            } else {
                odd[countOdd] = X;
                countOdd++;
            }

            if (countPar == 5) {
                countPar = 0;
                for (int j = 0; j < par.length; j++) {
                    System.out.println("par[" + j + "] = " + par[j]);
                }
            } else if (countOdd == 5) {
                countOdd = 0;
                for (int j = 0; j < odd.length; j++) {
                    System.out.println("odd[" + j + "] = " + odd[j]);
                }
            }
        }

        for (int i = 0; i < countOdd; i++) {
            System.out.println("odd[" + i + "] = " + odd[i]);
        }
        for (int i = 0; i < countPar; i++) {
            System.out.println("par[" + i + "] = " + par[i]);
        }
    }

}
