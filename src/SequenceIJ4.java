import java.text.DecimalFormat;
import java.util.Locale;

public class SequenceIJ4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        DecimalFormat df = new DecimalFormat("0.0");
        double j = 1;
        double i = 0;

        while (i < 2){
            for (int k = 0; k < 3; k++) {
                if (df.format(i).endsWith("0")){
                    System.out.println("I=" + df.format(i).charAt(0) + " J=" + df.format(j).charAt(0));
                }else {
                    System.out.println("I=" + df.format(i) + " J=" + df.format(j));
                }
                j++;
            }
            j -= 3;
            j += 0.2;
            i += 0.2;
        }
    }
}
