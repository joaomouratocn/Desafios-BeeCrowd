import java.io.IOException;
import java.util.Scanner;

public class DDD {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int DDD = input.nextInt();
        input.close();

        String result = switch (DDD) {
            case 11 -> "Sao Paulo";
            case 19 -> "Campinas";
            case 21 -> "Rio de Janeiro";
            case 27 -> "Vitoria";
            case 31 -> "Belo Horizonte";
            case 32 -> "Juiz de Fora";
            case 61 -> "Brasilia";
            case 71 -> "Salvador";
            default -> "DDD nao cadastrado";
        };

        System.out.println(result);
    }
}
