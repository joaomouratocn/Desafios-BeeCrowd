import java.util.Scanner;

public class LowestNumberAndPosition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sizeArray = input.nextInt();
        int[] numbers = new int[sizeArray];
        int lowestIndex = 0;
        int numberValue = input.nextInt();

        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
            if(numberValue > numbers[i]){
                numberValue = numbers[i];
                lowestIndex = i;
            }
        }

        input.close();

        System.out.println("Menor valor: "+numberValue);
        System.out.println("Posicao: "+lowestIndex);
    }
}
