import java.util.Locale;
import java.util.Scanner;

public class SeveralScoresWithValidation {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int response = 1;

        while (response != 2){
            if (response == 1){
                double totNotes = 0;
                response = 2;

                double[] notes = new double[2];

                for (int i = 0; i < notes.length;) {
                    double entryNote = input.nextDouble();
                    if (entryNote < 0 || entryNote > 10){
                        System.out.println("nota invalida");
                    }else {
                        notes[i] = entryNote;
                        i++;
                    }
                }

                for (double item : notes) {
                    totNotes += item;
                }

                double media = totNotes / 2;

                System.out.printf("media = %.2f\n", media);
            }
            System.out.println("novo calculo (1-sim 2-nao)");
            response = input.nextInt();
        }

    }
}
