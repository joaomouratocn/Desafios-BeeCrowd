import java.util.Scanner;

public class GameTimeWithMinutes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int hInit = input.nextInt();
        int mInit = input.nextInt();
        int hEnd = input.nextInt();
        int mEnd = input.nextInt();
        input.close();

        int mt1 = (hInit*60) + mInit;
        int mt2 = (hEnd*60) + mEnd;
        int h24 = (24*60);
        int result = 0;

        if(mt2>mt1){
            result = mt2-mt1;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",(result/60), (result%60));
        }else if(mt1>mt2){
            result = (h24-mt1)+(mt2);
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",(result/60), (result%60));
        }else {
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",24, 0);
        }
    }
}
