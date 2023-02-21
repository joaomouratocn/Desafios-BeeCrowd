import java.util.Locale;
import java.util.Scanner;

public class ScoreValidation {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double[] notes = new double[2];
        double sumNotes = 0;

        for (int i = 0; i < notes.length;){
            double entryNote = input.nextDouble();
            if (entryNote < 0 || entryNote > 10){
                System.out.println("nota invalida");
            }else {
                notes[i] = entryNote;
                i++;
            }
        }

        for (double item : notes) {
            sumNotes += item;
        }

        double media = sumNotes / 2;

        System.out.println("media = " + media);
    }
}
