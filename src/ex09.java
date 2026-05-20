import java.util.Scanner;

public class ex09 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("        Qual sua letra correspondente?( de a até d )");
        IO.println("        Resposta:");
        String letra = sc.next();
        switch (letra) {
            case "a":
                IO.println("        Excelente");
                break;
            case "b":
                IO.println("        Bom");
                break;
            case "c":
                IO.println("        Regular");
                break;
            case "d":
                IO.println("        Ruim");
                break;
            default:
                IO.println("Opção inválida, verifique seu caps lock ou digite outro caractere");
        }
    }
}
