import java.util.Locale;
import java.util.Scanner;

public class BanknotesAndCoins {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double entryValue = input.nextDouble();
        input.close();

        int notes = (int) entryValue; //pega o valor inteiro inserido
        int moedas = (int) ((entryValue - notes) * 100); // converter os centavos em inteiro para dividir

        int notes100 = notes / 100;
        notes -= notes100 * 100;
        int notes50 = notes / 50;
        notes -= notes50 * 50;
        int notes20 = notes / 20;
        notes -= notes20 * 20;
        int notes10 = notes / 10;
        notes -= notes10 * 10;
        int notes5 = notes / 5;
        notes -= notes5 * 5;
        int notes2 = notes / 2;
        notes -= notes2 * 2;
        int coins1 = notes;
        int coins050 = moedas / 50;
        moedas -= coins050 * 50;
        int coins025 = moedas / 25;
        moedas -= coins025 * 25;
        int coins010 = moedas / 10;
        moedas -= coins010 * 10;
        int coins005 = moedas / 5;
        moedas -= coins005 * 5;
        int coins001 = moedas;

        System.out.println("NOTAS:");
        System.out.println(notes100 + " nota(s) de R$ 100.00");
        System.out.println(notes50 + " nota(s) de R$ 50.00");
        System.out.println(notes20 + " nota(s) de R$ 20.00");
        System.out.println(notes10 + " nota(s) de R$ 10.00");
        System.out.println(notes5 + " nota(s) de R$ 5.00");
        System.out.println(notes2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(coins1 + " moeda(s) de R$ 1.00");
        System.out.println(coins050 + " moeda(s) de R$ 0.50");
        System.out.println(coins025 + " moeda(s) de R$ 0.25");
        System.out.println(coins010 + " moeda(s) de R$ 0.10");
        System.out.println(coins005 + " moeda(s) de R$ 0.05");
        System.out.println(coins001 + " moeda(s) de R$ 0.01");
    }
}
