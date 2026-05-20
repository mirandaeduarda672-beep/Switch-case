import java.util.Scanner;

public class ex03 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("        MENU\n         OPÇÕES:\n       X-Burguer=R$15,00(1)\n       X-Salada=R$16,00(2)\n       Refrigerante=R$7,00(3)\n       Batata frita=R$12,00(4)");
        IO.println("        \nEscolha uma opção:");
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                IO.println("        Você escolheu o X-Burguer");
                break;
            case 2:
                IO.println("        Você escolheu o X-Salada");
                break;
            case 3:
                IO.println("        Você escolheu o X-Refrigerante");
                break;
            case 4:
                IO.println("        Você escolheu a Batata frita");
                break;
            default:
                IO.println("        Opção inválida");}


    }
}
