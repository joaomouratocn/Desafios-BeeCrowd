import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        int hours = 0;
        int minutes = 0;
        int second = 0;

        Scanner input = new Scanner(System.in);
        int secondPassad = input.nextInt();
        input.close();

        hours = secondPassad / 3600; //Determina quantidade de horas passadas
        secondPassad %= 3600; //Seta na variavel de entrada o resto da divisão por hora
        minutes = secondPassad / 60; //Determina quandidade de minutos
        secondPassad %= 60; //Seta na variavel de entrada o resto da divisão por minuto
        second = secondPassad;  // Determina a quantidade de segundos

        System.out.println(hours + ":" + minutes + ":" + second);
    }
}
