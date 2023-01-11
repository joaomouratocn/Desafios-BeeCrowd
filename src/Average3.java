import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Average3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        DecimalFormat df = new DecimalFormat("0.0");

        Scanner input = new Scanner(System.in);
        double note1 = input.nextDouble();
        double note2 = input.nextDouble();
        double note3 = input.nextDouble();
        double note4 = input.nextDouble();

        double media = ((note1 * 2) + (note2 * 3) + (note3 * 4) + (note4 * 1)) / 10;

        if (media >= 7.0){
            System.out.println("Media: " + df.format(media));
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Media: " + df.format(media));
            System.out.println("Aluno reprovado.");
        }else if (media >= 5.0 && media <= 6.9){
            System.out.println("Media: " + df.format(media));
            System.out.println("Aluno em exame.");
            double nExam = input.nextDouble();
            System.out.println("Nota do exame: " + df.format(nExam));

            media = (media + nExam) / 2;

            if (media >= 5.0){System.out.println("Aluno aprovado.");}
            else {System.out.println("Aluno reprovado.");}

            System.out.println("Media final: " + df.format(media));
        }
    }
}
