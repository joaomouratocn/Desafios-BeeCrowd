import java.util.Scanner;

public class AgeInDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int entryDays = input.nextInt();
        input.close();

        int years = entryDays / 365;
        entryDays %= 365;
        int month = entryDays / 30;
        entryDays %= 30;
        int days = entryDays;


        System.out.println(years + " ano(s)");
        System.out.println(month + " mes(es)");
        System.out.println(days + " dia(s)");
    }
}
