import java.util.Scanner;

public class GameTime {
    public static void main(String[] args) {
        int day = 24;
        int result = 0;

        Scanner input = new Scanner(System.in);
        int hInit = input.nextInt();
        int hEnd = input.nextInt();
        input.close();

        if (hInit > hEnd){
            result = day - (hInit - hEnd);
        } else if (hEnd > hInit) {
            result = hEnd - hInit;
        }else{
            result = 24;
        }

        System.out.println("O JOGO DUROU " + result + " HORA(S)");
    }
}
