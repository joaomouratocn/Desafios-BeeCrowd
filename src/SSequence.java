import java.text.DecimalFormat;
import java.util.Locale;

public class SSequence {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        DecimalFormat df = new DecimalFormat("0.00");
        double s = 1;
        for (int i = 2; i <= 100; i++) {
            s += (double) 1 / (double) i;
        }
        System.out.println(df.format(s));
    }
}
