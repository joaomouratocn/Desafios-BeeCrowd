import java.io.IOException;
import java.util.Scanner;

public class Animal {
    public static void main(String[] args) throws IOException {
        String result = null;

        Scanner input = new Scanner(System.in);
        String type1 = input.next();
        String type2 = input.next();
        String type3 = input.next();
        input.close();

        switch (type1.toLowerCase()){
            case "vertebrado":
                switch (type2.toLowerCase()) {
                    case "ave" -> {
                        switch (type3.toLowerCase()) {
                            case "carnivoro" -> result = "aguia";
                            case "onivoro" -> result = "pomba";
                        }
                    }
                    case "mamifero" -> {
                        result = switch (type3.toLowerCase()) {
                            case "onivoro" -> "homem";
                            case "herbivoro" -> "vaca";
                            default -> null;
                        };
                    }
                }
            case "invertebrado":
                switch (type2.toLowerCase()) {
                    case "inseto" -> result = switch (type3.toLowerCase()) {
                        case "hematofago" -> "pulga";
                        case "herbivoro" -> "lagarta";
                        default -> result;
                    };
                    case "anelideo" -> {
                        result = switch (type3.toLowerCase()) {
                            case "hematofago" -> "sanguessuga";
                            case "onivoro" -> "minhoca";
                            default -> result;
                        };
                    }
                }
        }

        System.out.println(result);
    }
}