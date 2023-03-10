import java.text.DecimalFormat;
import java.util.Locale;

public class SSequenceII {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        DecimalFormat df = new DecimalFormat("0.00");
        double s = 1;
        int count = 2;
        for (int i = 3; i <= 27; i+=2) {
            s += (double) i / (double) count;
            count = count * 2;
        }
        System.out.println(df.format(s));
    }
}
