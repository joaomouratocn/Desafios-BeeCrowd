import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isValid = true;
        String result = "";

        while (isValid){
            int x = input.nextInt();
            int y = input.nextInt();

            if (x == 0 || y == 0){
                isValid = false;
                break;
            }
            else if (x > 0 && y > 0){
                result = "primeiro";
            } else if (x < 0 && y > 0) {
                result = "segundo";
            } else if (x < 0 && y < 0) {
                result = "terceiro";
            }else {
                result = "quarto";
            }
            System.out.println(result);
        }
    }
}
