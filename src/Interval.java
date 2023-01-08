import java.util.Locale;
import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double entryValue = input.nextDouble();
        input.close();

        if (entryValue >= 0.0000 && entryValue <= 25.0000000){
            System.out.println("Intervalo [0,25]");
        } else if (entryValue >= 25.00001 && entryValue <= 50.0000000) {
            System.out.println("Intervalo (25,50]");
        } else if (entryValue >= 50.00001 && entryValue <= 75.0000000) {
            System.out.println("Intervalo (50,75]");
        } else if (entryValue >= 75.00001 && entryValue <= 100.0000000) {
            System.out.println("Intervalo (75,100]");
        }else {
            System.out.println("Fora de intervalo");
        }
    }
}
