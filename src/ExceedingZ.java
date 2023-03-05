import java.util.Scanner;

public class ExceedingZ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 1;
        int X = input.nextInt();
        int Z = X;

        while (Z <= X){
            Z = input.nextInt();
        }
        for (int i = X; i < Z; i++) {
            X += i;
            count++;
            if (X > Z){break;}
        }
        System.out.println(count);
    }
}
