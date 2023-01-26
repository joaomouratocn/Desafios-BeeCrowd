import java.util.Scanner;

public class EventTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String dayInit = input.nextLine();
        String hourInitString = input.nextLine();
        String dayEnd = input.nextLine();
        String hourEndString = input.nextLine();
        input.close();

        int h24 = 24 * 3600;
        int intervalEvent;
        int totDay = 0;
        int totHour;
        int totMin;
        int totSeg;

        //pegando os dias e convertendo para Inteiro
        int dayInitInt = Integer.parseInt(dayInit.replaceAll("[^0-9]", ""));
        int dayEndInt = Integer.parseInt(dayEnd.replaceAll("[^0-9]", ""));

        //convertendo os horarios em um array de String
        String[] hInitSa = hourInitString.split(" : ");
        String[] hEndSa = hourEndString.split(" : ");

        int[] hInitInt = new int[hInitSa.length];
        int[] hEndInt = new int[hEndSa.length];

        //converetendo array de String em array de Int
        for (int i = 0; i < hInitSa.length; i++) {
            hInitInt[i] = Integer.parseInt(hInitSa[i]);
        }

        for (int i = 0; i < hEndSa.length; i++) {
            hEndInt[i] = Integer.parseInt(hEndSa[i]);
        }

        //covertendo horas em segundos
        int hourInitSec = (((hInitInt[0] * 60) + hInitInt[1]) * 60) + hInitInt[2];
        int hourEndSec = (((hEndInt[0] * 60) + hEndInt[1]) * 60) + hEndInt[2];

        totDay = dayEndInt - dayInitInt;

        //determina o intervalo do evento
        if(hourEndSec > hourInitSec){
            intervalEvent = hourEndSec - hourInitSec;
        }else {
            intervalEvent = (h24 - hourInitSec) + hourEndSec;
            totDay -= 1;
        }

        totHour = intervalEvent / 3600;
        if (totHour == 24){totHour = 0;}
        intervalEvent %= 3600;
        totMin = intervalEvent / 60;
        intervalEvent %= 60;
        totSeg = intervalEvent;

        System.out.println(totDay + " dia(s)");
        System.out.println(totHour + " hora(s)");
        System.out.println(totMin + " minuto(s)");
        System.out.println(totSeg + " segundo(s)");
    }
}
