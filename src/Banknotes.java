import java.util.Scanner;

public class Banknotes {
    public static void main(String[] args) {
        int insertValue = 0;
        int note100 = 0;
        int note50 = 0;
        int note20 = 0;
        int note10 = 0;
        int note5 = 0;
        int note2 = 0;
        int note1 = 0;

        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        input.close();
        insertValue = value;

        while (value > 0){
            if (value >= 100){
                note100 += 1;
                value -= 100;
            }else if (value >= 50){
                note50 += 1;
                value -= 50;
            }else if (value >= 20){
                note20 += 1;
                value -= 20;
            }else if (value >= 10){
                note10 += 1;
                value -= 10;
            }else if (value >= 5){
                note5 += 1;
                value -= 5;
            }else if (value >= 2){
                note2 += 1;
                value -= 2;
            }else{
                note1 += 1;
                value = 0;
            }
        }
        System.out.println(insertValue);
        System.out.println( note100 + " nota(s) de R$ 100,00");
        System.out.println( note50 + " nota(s) de R$ 50,00");
        System.out.println( note20 + " nota(s) de R$ 20,00");
        System.out.println( note10 + " nota(s) de R$ 10,00");
        System.out.println( note5 + " nota(s) de R$ 5,00");
        System.out.println( note2 + " nota(s) de R$ 2,00");
        System.out.println( note1 + " nota(s) de R$ 1,00");
    }
}
