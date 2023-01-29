import java.util.Scanner;

public class EvenOddPositiveAndNegative {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int countPair = 0;
        int countOdd = 0;
        int countPositive = 0;
        int countNegative = 0;

        Scanner input = new Scanner(System.in);
        numbers[0] = input.nextInt();
        numbers[1] = input.nextInt();
        numbers[2] = input.nextInt();
        numbers[3] = input.nextInt();
        numbers[4] = input.nextInt();
        input.close();

        for (int number : numbers){
            if (number % 2 == 0){ countPair += 1;}
            else {countOdd += 1;}

            if (number > 0) {countPositive += 1;}
            else if ( number < 0){countNegative += 1;}
        }

        System.out.println(countPair + " valor(es) par(es)");
        System.out.println(countOdd + " valor(es) impar(es)");
        System.out.println(countPositive + " valor(es) positivo(s)");
        System.out.println(countNegative + " valor(es) negativo(s)");
    }
}