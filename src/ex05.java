import java.util.Scanner;

public class ex05 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("        Escolha um tipo de usuário\n        Administrador(A)\n        Funcionário(F)\n        Cliente(C)");
        IO.println("Resposta:");
        String usuario = sc.nextLine();

        switch (usuario) {
            case "A":
                IO.println("        Acesso total liberado");
                break;
            case "F":
                IO.println("        Acesso parcial liberado");
                break;
            case "C":
                IO.println("        Acesso somente de vizualização liberado");
                break;
            default:
                IO.println("        Opção inválida, reveja seu caps lock ou escolha outro caractere");
        }
    }
}
