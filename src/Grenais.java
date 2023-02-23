import java.util.Scanner;

public class Grenais {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int reponse = 1;

        int amountGrenais = 0;
        int victoryGremio = 0;
        int victoryInter = 0;
        int ties = 0;

        while (reponse != 2){
            if (reponse == 1){
                int vInter = input.nextInt();
                int vGremio = input.nextInt();

                if (vInter > vGremio){victoryInter += 1;}
                else if (vGremio > vInter){victoryGremio += 1;}
                else {ties += 1;}

                amountGrenais += 1;
            }
            System.out.println("Novo grenal (1-sim 2-nao)");
            reponse = input.nextInt();
        }
        System.out.println(amountGrenais + " grenais");
        System.out.println("Inter:" + victoryInter);
        System.out.println("Gremio:" + victoryGremio);
        System.out.println("Empates:" + ties);

        if (victoryInter > victoryGremio){
            System.out.println("Inter venceu mais");
        } else if (victoryGremio > victoryInter) {
            System.out.println("Gremio venceu mais");
        }else {
            System.out.println("Não houve vencedor");
        }
    }
}
