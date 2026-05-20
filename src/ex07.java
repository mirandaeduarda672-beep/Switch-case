import java.util.Scanner;

public class ex07 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("        Escolha uma letra");
        IO.println("        Resposta:");
        String letra = sc.next();
        switch (letra) {
            case "a":
                IO.println("        Você escolheu uma vogal");
                break;
            case "e":
                IO.println("        Você escolheu uma vogal");
                break;
            case "i":
                IO.println("        Você escolheu uma vogal");
                break;
            case "o":
                IO.println("        Você escolheu uma vogal");
                break;
            case "u":
                IO.println("        Você escolheu uma vogal");
                break;
            default:
                IO.println("        Você não escolheu uma vogal");
        }
    }
}
