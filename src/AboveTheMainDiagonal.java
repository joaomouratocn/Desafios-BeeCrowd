import java.text.DecimalFormat;
import java.util.Scanner;

public class AboveTheMainDiagonal {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("0.0");
        Scanner input = new Scanner(System.in);
        double sum = 0;
        char O = input.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = input.nextDouble();
            }
        }

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                if (j > i) sum += M[i][j];
            }
        }

        if (O == 'M') sum /= (double) ((M.length * M.length) - 12) / 2; // 66
        System.out.println(df.format(sum));
    }
}
