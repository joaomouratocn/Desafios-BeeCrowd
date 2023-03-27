import java.util.Scanner;

public class ArrayFillIV {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] par = new int[5];
        int[] odd = new int[5];

        int entrynumber, countPar = 0, countOdd = 0;

        for (int i = 0; i < 15; i++) {
            entrynumber = input.nextInt();

            if (entrynumber % 2 == 0) {
                par[countPar] = entrynumber;
                countPar++;
            } else {
                odd[countOdd] = entrynumber;
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
                    System.out.println("impar[" + j + "] = " + odd[j]);
                }
            }
        }

        for (int i = 0; i < countOdd; i++) {
            System.out.println("impar[" + i + "] = " + odd[i]);
        }
        for (int i = 0; i < countPar; i++) {
            System.out.println("par[" + i + "] = " + par[i]);
        }
    }

}
