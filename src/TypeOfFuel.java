import java.util.Scanner;

public class TypeOfFuel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int entryValue = 0;
        int alcohol = 0;
        int diesel = 0;
        int gasoline = 0;

        while (entryValue != 4){
            switch (entryValue) {
                case 1 -> alcohol += 1;
                case 2 -> gasoline += 1;
                case 3 -> diesel += 1;
            }
            entryValue = input.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcohol);
        System.out.println("Gasolina: " + gasoline);
        System.out.println("Diesel: " + diesel);
    }
}
