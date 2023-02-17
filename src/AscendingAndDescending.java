import java.util.Scanner;

public class AscendingAndDescending {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()){
            int x = input.nextInt();
            int y = input.nextInt();

            if (x == y){break;}
            else if ( x > y){
                System.out.println("Decrescente");
            }else {
                System.out.println("Crescente");
            }
        }
    }
}
