import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int time = input.nextInt();
        input.close();

        int result = time * 2;

        System.out.println( result + " minutos");
    }
}