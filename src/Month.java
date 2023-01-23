import java.io.IOException;
import java.util.Scanner;

public class Month {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int monthSelected = input.nextInt();
        input.close();

        String result = null;

        switch (monthSelected) {
            case 1 -> result = "January";
            case 2 -> result = "February";
            case 3 -> result = "March";
            case 4 -> result = "April";
            case 5 -> result = "May";
            case 6 -> result = "June";
            case 7 -> result = "July";
            case 8 -> result = "August";
            case 9 -> result = "September";
            case 10 -> result = "October";
            case 11 -> result = "November";
            case 12 -> result = "December";
        }

        System.out.println(result);
    }
}
