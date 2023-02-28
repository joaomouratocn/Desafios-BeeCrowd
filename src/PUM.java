import java.util.Scanner;

public class PUM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberLines = input.nextInt();
        int cont = 0;

        for (int i = 1; i <= (numberLines * 4); i++) {
            cont ++;
            if (cont == 4){
                cont = 0;
                System.out.println("PUM");
            }else {
                System.out.print(i + " ");
            }
        }
    }
}
