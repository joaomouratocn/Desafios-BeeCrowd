import java.text.DecimalFormat;
import java.util.Scanner;

public class Experiments {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);

        int nCase = input.nextInt();
        int rabbit = 0;
        int frog = 0;
        int mouse = 0;

        for (int i = 0; i < nCase; i++) {
            int amount = input.nextInt();
            String type = input.next();

            switch (type) {
                case "C" -> rabbit += amount;
                case "R" -> mouse += amount;
                case "S" -> frog += amount;
            }
        }

        int totAnimals = rabbit + mouse + frog;
        double mediaRabbit = (rabbit * 100) / (double) totAnimals;
        double mediaMouse = (mouse * 100) / (double) totAnimals;
        double mediaFrog = (frog * 100) / (double) totAnimals;

        System.out.println("Total: " + totAnimals + " cobaias");
        System.out.println("Total de coelhos: " + rabbit);
        System.out.println("Total de ratos: " + mouse);
        System.out.println("Total de sapos: " + frog);
        System.out.println("Percentual de coelhos: " + df.format(mediaRabbit) + " %");
        System.out.println("Percentual de ratos: " + df.format( mediaMouse) + " %");
        System.out.println("Percentual de sapos: " + df.format(mediaFrog) + " %");
    }
}
