import java.util.Scanner;

public class FixedPassword {
    public static void main(String[] args) {
        boolean isValid = false;
        Scanner input = new Scanner(System.in);

        while (!isValid){
            int password = input.nextInt();
            if (password != 2002){
                System.out.println("Senha Invalida");
            }else {
                System.out.println("Acesso Permitido");
                isValid = true;
            }
        }
    }
}
