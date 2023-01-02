import java.util.Locale;
import java.util.Scanner;

public class SimpleCalculate {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int codProd1 = input.nextInt();
        int amountProd1 = input.nextInt();
        double priceProd1 = input.nextDouble();

        int codProd2 = input.nextInt();
        int amountProd2 = input.nextInt();
        double priceProd2 = input.nextDouble();

        input.close();

        double totProd1 = amountProd1 * priceProd1;
        double totProd2 = amountProd2 * priceProd2;

        double totPurchase = totProd1 + totProd2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", totPurchase);

    }
}
